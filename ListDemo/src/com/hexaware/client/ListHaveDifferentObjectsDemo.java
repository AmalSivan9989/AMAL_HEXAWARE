package com.hexaware.client;

import java.util.ArrayList;
import java.util.List;

public class ListHaveDifferentObjectsDemo {
    public static void main(String[] args) {
        List lst=new ArrayList();

        lst.add(5);//auto boxing
        lst.add(5.2);
        int a=10;
        lst.add(a);
        lst.add("rama");
       // Collections.sort(lst);
        for(Object obj:lst){
            if(obj instanceof Integer){
                int v1=(Integer)obj;
                System.out.println(v1+5);

            }
            else if (obj instanceof Double){
                double v1=(Double)obj;
                System.out.println(v1+10.2);

            }
            else if(obj instanceof String){
                String v1=(String)obj;
                System.out.println(v1+"obj");
            }
        }
    }
}
