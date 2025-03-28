package com.hexaware.client;

import com.hexaware.entity.EmpOverride;

import java.io.IOException;
public class FinalizeDemo{
public static void main(String[] args) throws IOException {
    EmpOverride emp1 = new EmpOverride(100,"tom", 8000);
    EmpOverride emp2 = new EmpOverride(101,"sam", 9000);
    EmpOverride emp3 = new EmpOverride(102,"vam", 7000);
    emp1= null;
    emp3=null;
    System.gc();//request for Garbage collection
    char ch =(char)System.in.read();

}




}
