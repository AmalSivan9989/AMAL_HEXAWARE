package com.hexaware.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods4 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("rama");
        lst.add("amar");
        lst.add("tom");
        lst.add("ravi");
        lst.add("sam");
       // System.out.println(lst);

        //converts list to array
        Object [] arr=lst.toArray();
        System.out.println(Arrays.toString(arr));

        //convert array to list
        Integer [] iarr={5,10,12,4,6,25};
        List lst2=Arrays.asList(iarr);
        System.out.println(lst2);


    }
}