package com.hexaware.comparators;

import com.hexaware.entity.Emp;

import java.util.Comparator;

public class EmpComparator implements Comparator<Emp> {




    @Override
    public int compare(Emp e1, Emp e2) {
        return e1.getEmpName().compareTo(e2.getEmpName());
    }
}