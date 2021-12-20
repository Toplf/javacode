package stu15.abstracttest;

public class Dog extends Pet {

    private String type;

    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight, String type) {
        super(name, age, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", киоо : " + type;
    }

    @Override
    public void speak() {
        System.out.println("═З═З═З");
    }

    @Override
    public void eat() {
        System.out.println("╣и│н╣К═и");
    }

}
