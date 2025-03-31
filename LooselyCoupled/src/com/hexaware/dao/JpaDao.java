package com.hexaware.dao;

public class JpaDao implements  IDao{
    @Override
    public void addEmp() {
        System.out.println("jpa -- add employee");
    }

    @Override
    public void getEmp() {
        System.out.println("jpa -- get employee");
    }
}
