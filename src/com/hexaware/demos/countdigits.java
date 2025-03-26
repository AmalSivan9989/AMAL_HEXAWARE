package com.hexaware.demos;
import java.util.*;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        countdigits(n);
    }
    static void countdigits(int n){
        int count=0;
        while(n!=0){
            int rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }

}
