package com.hexaware.demos;
import java.math.BigInteger;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        BigInteger fact=BigInteger.ONE;
        for (long i = 1; i <=num; i++) {
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
