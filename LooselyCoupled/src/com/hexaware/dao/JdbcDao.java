package com.hexaware.dao;

public class JdbcDao implements IDao{
    @Override
    public void addEmp() {
        System.out.println("jdbc--> add employee");
    }

    @Override
    public void getEmp() {
        System.out.println("jdbc--> get employee");
    }
}
