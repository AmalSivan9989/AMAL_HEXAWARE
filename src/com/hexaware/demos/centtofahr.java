package com.hexaware.demos;
import java.util.*;
public class centtofahr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
int res=covert_c_to_f(c);
    }
    static int covert_c_to_f(int c){
        int f=0;
        do{
                 f=(c*5/9)+32;
                System.out.println(f);
            }while(c>0);


return f;
    }
}
