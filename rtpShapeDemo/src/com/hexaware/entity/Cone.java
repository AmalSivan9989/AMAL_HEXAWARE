package com.hexaware.entity;

public class Cone extends Shape{


    private double height;

    public double getHeight() {
        return height;
    }

    @Override
    public double findVolume() {
        return Math.PI*getRadius()*getRadius()*height/3.0;
    }

    @Override
    public void acceptdata() {
        super.acceptdata();
        System.out.println("enter the height");
        this.height=scan.nextDouble();
    }
}
