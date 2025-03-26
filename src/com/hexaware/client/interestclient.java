package com.hexaware.client;
import com.hexaware.entity.interest;
import java.util.Scanner;

public class interestclient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextInt();
        double t = sc.nextInt();
        double r = sc.nextInt();
        double n=sc.nextInt();
        interest in=new interest();
        in.p=p;
        in.t=t;
        in.r=r;
        in.n=n;
        double si=in.simpleinterest(p,t,r);
        System.out.println("Si "+si);
        double ci=in.compoundinterest(p,t,r,n);
        System.out.println("ci "+ci);
    }
}
