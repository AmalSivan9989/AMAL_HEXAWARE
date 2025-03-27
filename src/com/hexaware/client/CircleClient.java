package com.hexaware.client;

import java.util.Scanner;

import com.hexaware.entity.Circle;

public class CircleClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();


        try {
            Circle obj = new Circle(radius);


            double area = obj.calculateArea(radius);
            double perimeter = obj.calculatePerimeter(radius);


            System.out.println("Area of the circle: " + area);
            System.out.println("Perimeter (Circumference) of the circle: " + perimeter);

        } catch (Exception e) {
            // TODO Auto-generated catch block
//			e.printStackTrace();
            System.err.println(e.getMessage());
        }


    }
}