package com.luof.oop.encapsulation;

public class Employee {
    private String name = "某员工";
    private int age = 30;
    private double salary;
    private String dept;

    public Employee() {
    }

    public Employee(String name, int age, double salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String say() {
        return "Employee{" +
          "name='" + name + '\'' +
          ", age=" + age +
          ", salary=" + salary +
          ", dept='" + dept + '\'' +
          '}';
    }
}
