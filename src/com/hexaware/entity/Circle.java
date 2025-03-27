package com.hexaware.entity;

public class Circle {

    private double radius;

    public Circle(double radius) throws Exception{
        super();
        if(radius < 0) {
            throw new Exception("Radius must be greater than zero");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle() {
        super();
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }


    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

}