package com.luof.oop.inheritance;

class Parent{

    private int f1 = 1; // 本类
    int f2 = 2; // 本包
    protected  int f3 = 3; // 子类
    public  int f4 = 4;

    private  void  fm1() {System.out.println("in fm1() f1=" + f1);}
    void fm2() {System.out.println("in fm2() f2=" + f2);}
    protected  void  fm3() {System.out.println("in fm3() f3=" + f3);}
    public void fm4() {System.out.println("in fm4() f4=" + f4);}
}

class Child extends Parent{

    //设父类和子类在同一个包内
    private int c1 = 21;
    public  int c2 = 22;

    private void cm1(){System.out.println("in cm1() c1=" + c1);}
    public  void cm2(){System.out.println("in cm2() c2=" + c2);}

    public static void main(String args[]){
        int i;
        Parent  p = new Parent();
        //System.out.println(p.f1); // 私有的
        i = p.f2;	        //	i = p.f3;		i = p.f4;				p.fm2();         //	p.fm3();	p.fm4();
        Child  c = new Child();
        i = c.f2;	        //	i = c.f3;		i = c.f4;
        i = c.c1;	        //	i = c.c2;
        c.cm1();        // c.cm2();    c.fm2();   c.fm3();   c.fm4()
    }
}


public class ModifierTest {
}
