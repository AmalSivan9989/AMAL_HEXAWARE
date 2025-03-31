package com.hexaware.exception;

public class AgeException extends Exception{
    public AgeException(String message) {
        super(message);
    }

    public AgeException() {
        super();
    }

    @Override
    public String toString() {
        return "Age must be 20 and 50";
    }
}
