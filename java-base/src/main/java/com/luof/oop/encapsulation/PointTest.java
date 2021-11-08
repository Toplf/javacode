package com.luof.oop.encapsulation;

public class PointTest {

    public static void main(String[] args) {
        Point p = new Point(30, 80);
        System.out.println(p.say());
        //System.out.println(p.getDistance(5, 2)); // 不要传其他数据
        System.out.println(p.getDistance()); // 使用内部数据
    }
}