package com.hexaware.entity;

import com.hexaware.exceptions.BinEmptyException;
import com.hexaware.exceptions.BinFullException;

public interface IStack {
    public void push(int element) throws BinFullException;
    public int pop() throws BinEmptyException;

}
