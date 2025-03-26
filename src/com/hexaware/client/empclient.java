package com.hexaware.client;
import com.hexaware.entity.emp;
public class empclient {
    public static void main(String[] args) {
        emp e1=new emp(1001,"rama",10000);
        emp e2=new emp(1002,"shyama",20000);
        emp e3=new emp(1003,"varma",5000);

        System.out.println("no of employee "+emp.count);
        System.out.println("total salary "+emp.sum);
    }
}
