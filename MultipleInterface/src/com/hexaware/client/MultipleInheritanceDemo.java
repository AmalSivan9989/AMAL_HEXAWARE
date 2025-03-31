package com.hexaware.client;

import com.hexaware.entity.IQueue;
import com.hexaware.entity.IStack;
import com.hexaware.entity.StackQueue;
import com.hexaware.exceptions.BinEmptyException;
import com.hexaware.exceptions.BinFullException;

public class MultipleInheritanceDemo {
    public static void main(String[] args)  {
        IStack stack= StackQueue.getStack();
        try {
            stack.push(5);
            stack.push(10);
            stack.push(15);
        }catch(BinFullException e){
            System.out.println(e);
        }
        try{
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }catch(BinEmptyException e){
            System.out.println(e);
        }
        System.out.println("---------------------------------------------------");

        IQueue queue= StackQueue.getQueue();
        try {
            queue.enqueue(5);
            queue.enqueue(10);
            queue.enqueue(15);
        }catch(BinFullException e){
            System.out.println(e);
        }
        try{
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
        }catch(BinEmptyException e){
            System.out.println(e);
        }


    }
}
