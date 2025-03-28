package com.hexaware.client;

import com.hexaware.entity.Animal;
import com.hexaware.entity.Cat;
import com.hexaware.entity.Dog;
import com.hexaware.entity.Lion;

public class AnimalClient {
    public static void main(String[] args) {
      /*  Animal lion=new Lion();
        Animal dog=new Dog();
        Animal cat=new Cat();

        lion.Makenoise();
        System.out.println();
        dog.Makenoise();
        System.out.println();
        cat.Makenoise();
        System.out.println();

       */

        Animal[] arr=new Animal[3];
        arr[0]=new Lion();
        arr[1]=new Dog();
        arr[2]=new Cat();
        for (int i = 0; i < arr.length; i++) {
            display(arr[i]);
        }


    }
    public static void display(Animal obj){
        obj.Makenoise();
    }
}
