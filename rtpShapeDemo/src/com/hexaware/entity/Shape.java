package com.hexaware.entity;

public abstract class Shape implements IShape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void acceptdata() {
        System.out.println("enter the radius");
        this.radius=scan.nextDouble();

    }
}
