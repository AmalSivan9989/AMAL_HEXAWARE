package com.hexaware.client;

import com.hexaware.comparators.EmpComparator;
import com.hexaware.entity.Emp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Emp e1=new Emp(1007,"rama",75000);
        Emp e2=new Emp(1001,"sam",35000);
        Emp e3=new Emp(1009,"amar",55000);
        Emp e4=new Emp(1005,"tom",75000);
        Emp e5=new Emp(1002,"teja",45000);
        Emp e6=new Emp(1009,"amar",55000);
        Set<Emp> set=new TreeSet<>(new EmpComparator());
        System.out.println(set.add(e1));
        System.out.println(set.add(e2));
        System.out.println(set.add(e3));
        System.out.println(set.add(e4));
        System.out.println(set.add(e5));
        System.out.println(set.add(e2));
        System.out.println(set.add(e6));

        set.forEach((e)-> System.out.println(e));
    }
}
