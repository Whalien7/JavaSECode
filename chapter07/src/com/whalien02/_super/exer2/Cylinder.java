package com.whalien02._super.exer2;
/*
* 在Cylinder类中修改求表面积的方法findArea()和求体积的方法findVolume(),使用上super。
**/


public class Cylinder extends Circle {

    private double length;//高

    public Cylinder(){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //求圆柱的体积
    public double findVolume(){
        return super.findArea() * getLength();
    }

    //求表面积
    public double findArea(){
        return 3.14 * getRadius() * getRadius() * 2 +
                2 * 3.14 * getRadius() * getLength();
    }
}
