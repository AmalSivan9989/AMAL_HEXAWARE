package com.hexaware.client;

import com.hexaware.entity.Loan;
import com.hexaware.exception.AgeException;
import com.hexaware.exception.IncomeException;

import java.sql.SQLOutput;

public class Demo4 {
    public static void main(String[] args) {
        try {
            Loan loanObj = new Loan(19, 200000);
            System.out.println(loanObj.getRes());
        }catch(AgeException| IncomeException e){
            System.out.println(e);
        }
    }
}
