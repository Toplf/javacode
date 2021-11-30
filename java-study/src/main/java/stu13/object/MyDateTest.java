package stu13.object;

public class MyDateTest {
    public static void main(String[] args) {
        Object obj1 = new MyDate(2019,12,10);
        Object obj2 = new MyDate(2019, 12, 10);
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
