package com.hexaware.entity;

public class multtable {
    public int num;

    public multtable(int num) throws Exception {
        super();
        if(num<=0){
            throw new Exception("number must be greater than zero");
        }
        this.num = num;
    }
    public void domultiply(){
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d * %d = %d\n",num,i,(num*i));
        }
    }

    public void domultiply(int rows){
        for (int i = 1; i <=rows ; i++) {
            System.out.printf("%d * %d = %d\n",num,i,(num*i));
        }
    }
    public void domultiply(int start,int end){
        for (int i = start; i <=end ; i++) {
            System.out.printf("%d * %d = %d\n",num,i,(num*i));
        }
    }
}
