package com.hexaware.entity;

public class factorial {
    public int n;
    public int fact=1;
    public int calfactorial(int n){
        for (int i = 1; i <=this.n; i++) {
            this.fact=this.fact*i;
        }
        return fact;
    }
}
