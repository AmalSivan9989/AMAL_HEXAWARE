package com.hexaware.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterationDemo1 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("rama");
        lst.add("amar");
        lst.add("tom");
        lst.add("ravi");
        lst.add("sam");
        Iterator<String> it=lst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
           // lst.add("ggg");
        }

    }
}
