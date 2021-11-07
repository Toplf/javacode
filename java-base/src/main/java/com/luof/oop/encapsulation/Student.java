package com.luof.oop.encapsulation;

// 写一个学生类, 包含属性, name, grade, score, 把属性私有化, 在测试类中通过公共的set/get方法处理属性.
public class Student {

    private String name = "某同学";
    private int grade = 2;
    private double score;

    public Student() {
        this("小明", 4);
		/*
		name = "小明";
		grade = 4;
		score = 90;
		*/
    }

    public Student(String name, int grade) {
        this(name, grade, 90);
		/*
		this.name = name;
		this.grade = grade;
		this.score = 90;
		*/
    }

    public Student(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 10) {
            this.grade = grade; // 有条件赋值
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setScore(double score) {
        if (score >= 0 && score < 101) {
            this.score = score;
        }
    }

    public double getScore() {
        return score;
    }

    public String say() {
        return "姓名 : " + name + ", 年级 : " + grade + ", 分数 : " + score;
    }

}