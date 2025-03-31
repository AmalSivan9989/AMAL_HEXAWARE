package com.hexaware.exception;

public class IncomeException extends Exception{
    public IncomeException() {
        super();
    }

    public IncomeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Income must be minimum 4 lakhs.";
    }
}
