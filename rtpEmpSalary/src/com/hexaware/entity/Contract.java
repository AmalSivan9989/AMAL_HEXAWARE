package com.hexaware.entity;

public class Contract extends Emp{
    private int days;

    public Contract(int empId, String empName, double empSal, int days) {
        super(empId, empName, empSal);
        this.days = days;

    }

    public int getDays() {
        return days;
    }

    @Override
    public double calSalary() {
        return getEmpSal()*days;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%20s%20s%20d%20.2f","--","--",days,calSalary());
    }
}
