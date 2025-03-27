package com.hexaware.client;
import com.hexaware.entity.multtable;
public class multableclient {
    public static void main(String[] args) {
        try {
            multtable obj = new multtable(5);
            obj.domultiply();
            System.out.println("-----------------");
            obj.domultiply(7);
            System.out.println("-----------------");
            obj.domultiply(3,7);
            System.out.println("-----------------");

        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
