package com.hexaware.comparators;

import com.hexaware.entity.Emp;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
        return Double.valueOf(e1.getEmpSal()).compareTo(e2.getEmpSal());
    }
}
