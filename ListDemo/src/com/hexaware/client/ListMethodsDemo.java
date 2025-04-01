package com.hexaware.client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListMethodsDemo {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("rama");
        lst.add("amar");
        lst.add("tom");
        lst.add("ravi");
        lst.add("sam");
        System.out.println(lst);
        lst.add(2,"salman");
        System.out.println(lst);
        System.out.println("get element at index 2: "+lst.get(2));
        lst.remove(2);
        System.out.println(lst);
        lst.remove("ravi");
        System.out.println(lst);
        System.out.println("size: "+lst.size());
        System.out.println("contains tom: "+lst.contains("tom"));
        System.out.println("contains peter: "+lst.contains("peter"));
        lst.clear();
        System.out.println("size: "+lst.size());
        System.out.println("is empty: "+lst.isEmpty());

    }
}
