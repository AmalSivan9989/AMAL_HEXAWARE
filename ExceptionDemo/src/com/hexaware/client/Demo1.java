package com.hexaware.client;

import com.hexaware.exception.AgeException;
import com.hexaware.exception.IncomeException;

public class Demo1 {
    public static void main(String[] args) {
String res=checkEligible(17,200000);
        System.out.println(res);
    }
    public static String checkEligible(int age,double income){


        try {
            String res=processEligible(age,income);
            return res;

        }
        catch (AgeException |IncomeException e) {
            System.out.println(e);
            return e.getMessage();
        }
        finally{
            System.out.println("i am in finally block");
        }
    }

    public static String processEligible(int age,double income) throws AgeException,IncomeException {
        if (age < 20 || age > 50) {
            throw new AgeException("age must be twenty and fifty");
        }
if (income<400000) {
    throw new IncomeException("Annual income must be minimum 4 lakhs.");
}
        return "Eligible";

    }
}

