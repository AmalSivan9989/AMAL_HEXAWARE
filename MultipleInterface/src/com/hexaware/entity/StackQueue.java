package com.hexaware.entity;

import com.hexaware.exceptions.BinEmptyException;
import com.hexaware.exceptions.BinFullException;

import java.net.BindException;

public  class  StackQueue implements IStack,IQueue {
  private int [] arr=new int[5];
  int index=0;
  int head=0;
  private StackQueue(){

  }


  public static IStack getStack(){
      IStack stackObj=new StackQueue();
      return stackObj;

  }
    public static IQueue getQueue(){
        IQueue queueObj=new StackQueue();
        return queueObj;

    }


  public void push(int element) throws BinFullException {
      if(index<arr.length-1){
          arr[index]=element;}
          else throw new BinFullException();
      }



    public int peek(){

        return arr[index];
    }
    public int pop() throws BinEmptyException{
      if(index==0) throw new BinEmptyException();
      return arr[--index];

    }

    public void enqueue(int element) throws BinFullException{
        if(index<arr.length-1){
            arr[index++]=element;}
        else throw new BinFullException();

    }
    public int dequeue() throws BinEmptyException{
      if(head==arr.length) throw new BinEmptyException();
      int res=arr[head];
      ++head;


      return arr[head];
    }


}
