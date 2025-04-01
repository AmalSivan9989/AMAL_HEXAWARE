package com.hexaware.client;

import java.util.ArrayList;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<String>();

        lst.add("rama");
        lst.add("amar");
        lst.add("tom");
        lst.add("ravi");
        lst.add("sam");
        System.out.println(lst);
        System.out.println("-------descending order--------");
        lst.sort((s1,s2)->s2.compareTo(s1));
        System.out.println(lst);
        System.out.println("-------ascending order--------");
        lst.sort(null);
        System.out.println(lst);

    }
}
