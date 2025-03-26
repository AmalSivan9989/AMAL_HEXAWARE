package com.hexaware.entity;

public class interest {
   public  double p,t,r,n;


   public double simpleinterest(double p,double t,double r){
       return (p*t*r)/100;
   }
   public double compoundinterest(double p,double t,double r,double n){
       return p*Math.pow(1+(r/(n*100)),n*t)-p;
   }

}
