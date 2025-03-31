package com.hexaware.client2;

import com.hexaware.service.Calculable;

public class LambdaDemo2 {
    public static void main(String[] args) {
        display((a,b)->a+b,10,5);
        display((a,b)->a-b,10,5);
        display((a,b)->a*b,10,5);
        display((a,b)->a/b,10,5);
    }
    public static void display(Calculable obj,int a,int b){
       int res= obj.calc(a,b);
        System.out.println(res);
    }
}
