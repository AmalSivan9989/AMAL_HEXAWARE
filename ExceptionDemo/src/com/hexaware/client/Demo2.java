package com.hexaware.client;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("line1");
        System.out.println("line2");
        try {
           // calc(9, 0);
            calc(9, 3);
            // down sout works only if there is no exception if exception is present then it does not prints

            System.out.println("line2.1");
            System.out.println("line2.2");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        System.out.println("line 3");
        System.out.println("line 4");
    }

    public static void calc(int n,int d){
        int res=n/d;
        System.out.println(res);
    }
}
