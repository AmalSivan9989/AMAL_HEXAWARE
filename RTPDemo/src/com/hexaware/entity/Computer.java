package com.hexaware.entity;

public  class Computer extends Product{
    private String hdd;
    private String processor;

    public Computer(int prodId, String prodName, double price, String hdd, String processor) {
        super(prodId, prodName, price);
        this.hdd = hdd;
        this.processor = processor;
    }

    public String getHdd() {
        return hdd;
    }

    public String getProcessor() {
        return processor;
    }
    public boolean isExpensive(){
        if(getPrice()>=80000){
            return true;
        }
        return false;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%20s%20s%20s%20s\n",hdd,processor,"--",isExpensive());
    }
}
