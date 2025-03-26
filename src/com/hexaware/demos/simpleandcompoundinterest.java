package com.hexaware.demos;
import java.util.*;
public class simpleandcompoundinterest {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int t = sc.nextInt();
    int r = sc.nextInt();
    int n=sc.nextInt();
        System.out.println("simple interest "+(p*t*r)/100);
   double ci=p*Math.pow(1+(r/(n*100)),n*t)-p;
        System.out.println("compound interest "+ci);
        ;

}}
