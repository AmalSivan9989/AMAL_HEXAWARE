package com.hexaware.entity;

public class OnRoll extends Emp{

    private double da;
    private double pf;

    public OnRoll(int empId, String empName, double empSal) {
        super(empId, empName, empSal);
        this.da=getEmpSal()*0.4;
        this.pf=getEmpSal()*0.1;
    }

    public double getDa() {
        return da;
    }

    public double getPf() {
        return pf;
    }

    @Override
    public double calSalary() {
        return getEmpSal()+da-pf;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%20.2f%20.2f%20s%20.2f\n",da,pf,"--",calSalary());

    }
}
