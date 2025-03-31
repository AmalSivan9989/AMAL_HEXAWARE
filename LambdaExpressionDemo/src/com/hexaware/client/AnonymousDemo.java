package com.hexaware.client;

import com.hexaware.service.Flyable;

public class AnonymousDemo {
    public static void main(String[] args) {
        Flyable eagle=new Flyable(){
            @Override
            public void fly() {
                System.out.println("eagle fly");
            }
        };


        Flyable flight=new Flyable(){
            @Override
            public void fly() {
                System.out.println("eagle fly");
            }
        };
        eagle.fly();
        flight.fly();

    }
}
