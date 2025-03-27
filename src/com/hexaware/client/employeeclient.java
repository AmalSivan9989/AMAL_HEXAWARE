package com.hexaware.client;

import com.hexaware.entity.employee;

public class employeeclient {
    public static void main(String[] args){
        employee emp=new employee();
        try {
            emp.setEmpname("rama");
            emp.setAge(21);
            emp.setSal(9000);
            System.out.println("name=" + emp.getEmpname() +
                    "age=" + emp.getAge() + "sal=" + emp.getSal() +
                    "da=" + emp.getda() + "pf=" + emp.getpf());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}