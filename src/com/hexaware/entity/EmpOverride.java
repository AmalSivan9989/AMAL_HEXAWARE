package com.hexaware.entity;



public class EmpOverride {
    private int empId;
    private String empName;
    private double sal;
    public EmpOverride(int empId,String empName,double sal) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }
    public boolean equals(Object obj) {
        EmpOverride emp = (EmpOverride) obj;
        if(this == emp) return true;
        if(this.empId == emp.empId && this.empName.equals(emp.empName))
            return true;
        return false;
    }
    protected void finalize() throws Throwable{
        System.out.println("system gc emp="+empId);
    }

}