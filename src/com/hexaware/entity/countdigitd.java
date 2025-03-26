package com.hexaware.entity;

public class countdigitd {
    public int n;
public int rem;
    public void count(int n){
        int count=0;
        while(n!=0){
           rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
