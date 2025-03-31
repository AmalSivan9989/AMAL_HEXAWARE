package com.hexaware.client2;

import com.hexaware.service.Flyable;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Flyable eagle=()-> System.out.println("eagle fly");
        Flyable flight=()-> System.out.println("flight fly");
        display(eagle);
        display(flight);
    }
    public static void display(Flyable obj){
        obj.fly();
    }
}
