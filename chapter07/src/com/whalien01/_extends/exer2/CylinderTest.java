package com.whalien01._extends.exer2;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(2.3);
        cy.setLength(1.4);

        System.out.println("圆柱的体积为：" + cy.findVolume());

        System.out.println("圆柱的底面积：" + cy.findArea());

    }
}

