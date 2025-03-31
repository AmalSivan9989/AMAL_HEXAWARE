package com.hexaware.entity;

import com.hexaware.exceptions.BinEmptyException;
import com.hexaware.exceptions.BinFullException;

public interface IQueue {
    public void enqueue(int element) throws BinFullException;
    public int dequeue() throws BinEmptyException;
}
