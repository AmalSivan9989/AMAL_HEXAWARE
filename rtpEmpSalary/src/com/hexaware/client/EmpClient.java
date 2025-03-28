package com.hexaware.client;

import com.hexaware.entity.Contract;
import com.hexaware.entity.IEmp;
import com.hexaware.entity.OnRoll;

public class EmpClient {
    public static void main(String[] args) {
        IEmp[] arr=new IEmp[4];
        arr[0]=new OnRoll(1001,"ram",25000);
        arr[1]=new OnRoll(1001,"tom",35000);
        arr[2]=new Contract(1003,"sam",1000,10);
        arr[2]=new Contract(1004,"jam",3000,10);
        System.out.printf("%20s20s%20s%20s%20s%20s\n","id","name","salary","da","pf","days","netsal");
        for (IEmp emp:arr){
            emp.display();
        }

    }
}
