package com.hexaware.entity;

import com.hexaware.exception.AgeException;
import com.hexaware.exception.IncomeException;

public class Loan {
    private int age;
    private double income;
    private String res="not eligible";
    public Loan(int age, double income) throws AgeException, IncomeException {
        if(age<20 || age>50)
            throw new AgeException();
        this.age = age;
        if(income<400000)
            throw new IncomeException();
        this.income = income;
        this.res="eligible";
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public String getRes() {
        return res;
    }
}
