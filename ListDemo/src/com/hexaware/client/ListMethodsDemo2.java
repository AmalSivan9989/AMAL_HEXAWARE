package com.hexaware.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethodsDemo2 {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("rama");
        lst.add("amar");
        lst.add("tom");
        lst.add("ravi");
        lst.add("sam");
        System.out.println(lst);
        lst.sort(null);//introduced in jdk8
       // Collections.sort(lst); old approach
        System.out.println("------------------");
        System.out.println(lst);
        lst.sort(Collections.reverseOrder());
        System.out.println("------------------");
        System.out.println(lst);
        for(String str:lst){
            System.out.println(str);
        }

        lst.forEach((str)->System.out.println(str));
    }
}
