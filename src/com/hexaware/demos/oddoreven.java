package com.hexaware.demos;
import java.util.*;
public class oddoreven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("even number "+number);
        }
        else{
            System.out.println("odd number "+number);
        }
    }
}
