package com.hexaware.entity;

public abstract  class Emp  implements IEmp{

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
    public void display() {

        System.out.printf("%20d%20s%20.2f",empId,empName,empSal);

    }
}
