package com.hexaware.entity;

public class Sphere extends Shape{

    @Override
    public double findVolume() {
        return 4/3.0*Math.PI*getRadius()*getRadius()*getRadius();
    }
}
