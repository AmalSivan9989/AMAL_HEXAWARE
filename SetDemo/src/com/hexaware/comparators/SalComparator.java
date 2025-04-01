package com.hexaware.comparators;

import com.hexaware.entity.Emp;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
      Double s1=e1.getEmpSal();
      Double s2=e2.getEmpSal();
      if(s1.compareTo(s2)==0){
          return Integer.valueOf(e1.getEmpId()).compareTo(e2.getEmpId());
      }
      else{
          return s1.compareTo(s2);
      }
    }
}
