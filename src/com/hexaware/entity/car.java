package com.hexaware.entity;

public class car extends vehicle {
    public int carid;
    public String carname;

    public car(){
        super();
        System.out.println("no argument");
    }
    public car(int carid){
        this();
        this.carid=carid;
        System.out.println("one argument");

    }
    public car(int carid,String carname){
      this(carid);
        this.carid=carid;
        this.carname=carname;
        System.out.println("two argument");
    }
}
class vehicle{
    vehicle(){
        System.out.println("no argument vehicle");
    }
    vehicle(int color){

        System.out.println("vehicle one argument");
    }
}
