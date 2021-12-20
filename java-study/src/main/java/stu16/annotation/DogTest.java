package stu16.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//写一个自定义注解 HelloAnnotaion, 包含属性int no, String value
//把刚才的自定义注解约束一下, 使它只能给类和属性修饰, 并且这个注解可以通过反射处理.
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface HelloAnnotaion {
    int no() default 10;
    String value() default "缺省值";
}

//再写一个Dog, 属性name, age, 在Dog类中测试可以在哪些位置使用注解.
@HelloAnnotaion(no = 20)
class Dog {

    @HelloAnnotaion(value = "姓名")
    private String name;
    private int age;

    //@HelloAnnotaion("字符串") // 当属性名为value()时可以省略属性名
    public Dog() {
    }

    public Dog(/*@HelloAnnotaion*/ String name, int age) {
        super();
        this.name = name;
        this.age = age;
        /*@HelloAnnotaion*/ int x = 10;
    }

    //@HelloAnnotaion
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }


}

public class DogTest {

}
