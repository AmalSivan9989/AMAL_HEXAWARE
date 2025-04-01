package com.hexaware.entity;

public class Emp implements Comparable<Emp>{
    private int empId;
    private String empName;
    private double empSal;

    public Emp(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    @Override
    public String toString() {

        return empId+" "+empName+" "+empSal;
    }

    @Override
    public int compareTo(Emp emp) {

        return Integer.valueOf(empId).compareTo(emp.empId);
    }
}
