package com.hexaware.client;

import java.util.Scanner;
import com.hexaware.entity.countdigitd;
public class countdigitsclient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countdigitd c=new countdigitd();
        System.out.println("count is ");
        c.count(n);

    }
}
