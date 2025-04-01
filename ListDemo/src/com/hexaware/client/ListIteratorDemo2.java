package com.hexaware.client;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
    public static void main(String[] args) {


        List<String> lst = new ArrayList<>();
        lst.add("rama");
        lst.add("amar");
        lst.add("tom");
        lst.add("ravi");
        lst.add("sam");

        ListIterator<String> it=lst.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------");
        //reverse order
        while(it.hasPrevious()){
            System.out.println(it.previous());

        }
    }
}