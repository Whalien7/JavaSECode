package com.whalien01._extends;

public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tony";
        p1.eat();

        System.out.println(p1.toString());

        Student s1 = new Student();
        s1.name = "Tom";
        s1.eat();

        //获取s1所属类的父类
        System.out.println(s1.getClass().getSuperclass());
        //获取p1所属类的父类
        System.out.println(p1.getClass().getSuperclass());//java.lang.Object

    }
}
