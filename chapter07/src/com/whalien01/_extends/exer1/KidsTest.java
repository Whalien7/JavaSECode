package com.whalien01._extends.exer1;

public class KidsTest {
    public static void main(String[] args) {

        Kids kid = new Kids();

        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(12);

        //父类中声明的方法
        kid.employeed();
        kid.manOrWoman();

        //Kids类声明的方法
        kid.printAge();
    }
}
