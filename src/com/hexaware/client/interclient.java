package com.hexaware.client;

import com.hexaware.entity.inter;

public class interclient {
    public static void main(String[] args) {
        inter i=new inter();
        try {
            i.setP(5000);
            i.setT(3);
            i.setR(5);
            i.setN(5);
            double res=i.simpleinterest(i.getP(),i.getT(),i.getR());
            System.out.println("si="+res);

            double res1=i.compoundinterest(i.getP(),i.getT(),i.getR(),i.getN());
            System.out.println("ci"+res1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
