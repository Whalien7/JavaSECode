package com.whalien01._extends;

public class Student extends Person{

    String school;

    public void study(){
        System.out.println("学生学习");
    }

    public void show1(){
        System.out.println("age : " + getAge());
    }
}
