package com.hexaware.util;
//static method overload
public class mutil {
    public static double roundoff(double value){
        return Math.round(value*100)/100.0;

    }
    public static double roundoff(float value){
        return Math.round(value*100)/100.0;

    }
    public static double roundoff(double value,int n){
        double pow=Math.pow(10,n);
        return Math.round(value*pow)/pow;

    }
}
