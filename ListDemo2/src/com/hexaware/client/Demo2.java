package com.hexaware.client;

import com.hexaware.comparators.EmpComparator;
import com.hexaware.entity.Emp;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Emp> lst=new ArrayList<>();
        Emp e1=new Emp(1007,"rama",75000);
        Emp e2=new Emp(1001,"sam",35000);
        Emp e3=new Emp(1009,"amar",55000);
        Emp e4=new Emp(1005,"tom",75000);
        Emp e5=new Emp(1002,"teja",45000);
        lst.add(e1);
        lst.add(e2);
        lst.add(e3);
        lst.add(e4);
        lst.add(e5);
        lst.add(e1);
        System.out.println("---------sort by name----------");
        lst.sort((emp1,emp2)->emp1.getEmpName().compareTo(emp2.getEmpName()));
      //  lst.sort(new EmpComparator());
        lst.forEach((e)-> System.out.println(e));
        System.out.println("---------sort by salary----------");
        lst.sort((emp1,emp2)->Double.valueOf(emp1.getEmpSal()).compareTo(emp2.getEmpSal()));
        lst.forEach((e)-> System.out.println(e));
    }
}
