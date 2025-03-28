package com.hexaware.entity;

public class Mobile extends Product{
    private String camPx;

    public Mobile(int prodId, String prodName, double price, String camPx) {
        super(prodId, prodName, price);
        this.camPx = camPx;
    }

    public String getCamPx() {
        return camPx;
    }

    public boolean isExpensive(){
        if(getPrice()>=20000){
            return true;
        }
        return false;
    }
    @Override
    public void display() {
        super.display();
        System.out.printf("%20s%20s%20s%20s\n","--","--",camPx,isExpensive());
    }
}
