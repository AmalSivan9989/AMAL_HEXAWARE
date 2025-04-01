package com.hexaware.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods3 {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("rama");
        lst.add("amar");
        lst.add("tom");
        lst.add("ravi");
        lst.add("sam");
        System.out.println(lst);
        List <String> lst2= Arrays.asList("ravi","sam","amar");
        boolean res=lst.containsAll(lst2);
        System.out.println("contains All: "+res);
        lst.retainAll(lst2);
        System.out.println(lst);
        lst.removeAll(lst2);
    }
}
