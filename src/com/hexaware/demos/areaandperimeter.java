package com.hexaware.demos;

import java.util.*;

public class areaandperimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       float pi=3.14f;
       int radius=sc.nextInt();
        System.out.println("Area of circle is "+pi*radius*radius);
        System.out.println("perimeter of circle is "+2*pi*radius);
    }
}
