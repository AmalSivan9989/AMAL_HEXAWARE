package com.hexaware.client;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ListIteratorDemo3 {
    public static void main(String[] args) {
        Vector<String> lst = new Vector<String>();
        lst.add("rama");
        lst.add("amar");
        lst.add("tom");
        lst.add("ravi");
        lst.add("sam");


        Enumeration loop=lst.elements();
        while(loop.hasMoreElements()){
            System.out.println(loop.nextElement());
        }


}
}
