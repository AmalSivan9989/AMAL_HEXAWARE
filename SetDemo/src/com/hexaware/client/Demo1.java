package com.hexaware.client;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        System.out.println(set.add("rama"));
        System.out.println(set.add("shyam"));
        System.out.println(set.add("tom"));
        System.out.println(set.add("peter"));
        System.out.println(set.add("akbar"));
        System.out.println(set.add("rama"));
        System.out.println(set);


    }
}
