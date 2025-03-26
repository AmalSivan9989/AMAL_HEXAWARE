package com.hexaware.client;

import java.util.Scanner;
import com.hexaware.entity.factorial;
public class factorialclient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial f=new factorial();
        f.n=n;
        int res=f.calfactorial(n);
        System.out.println("factorial "+res);
    }
}
