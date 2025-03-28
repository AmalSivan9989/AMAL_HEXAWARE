package com.hexaware.client;

import com.hexaware.entity.Computer;
import com.hexaware.entity.IProduct;
import com.hexaware.entity.Mobile;
import com.hexaware.entity.Product;

public class ProductClient {
    public static void main(String[] args) {
       IProduct[] arr=new IProduct[4];
       arr[0]=new Computer(1001,"acer laptop",45000,"i8","560TB");
       arr[1]=new Computer(1002,"mac laptop",95000,"i8","720TB");
       arr[2]=new Mobile(1003,"samsung galaxy",16000,"20px");
       arr[3]=new Mobile(1003,"vivo",22000,"30px");
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n","ID","Name","HDD","Processor","storage","Campx","isExpensive");
       for (int i = 0; i < arr.length; i++) {
            show(arr[i]);
        }
    }
    public static void show(IProduct product){
        product.display();
    }
}

