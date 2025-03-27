package com.hexaware.entity;

public class employee {
    private String Empname;
    private int Age;
    private int Sal;

    public String getEmpname() {
        return Empname;
    }

    public void setEmpname(String Empname) throws Exception {
        if(!Empname.matches("[A-Za-z]+"))
            throw new Exception("Name must have only alphabets");
        this.Empname = Empname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) throws Exception{
        if(Age<20 || Age>80)
            throw new Exception("age must be 20 and 80");
        this.Age = Age;
    }

    public int getSal() {
        return Sal;
    }

    public void setSal(int Sal) throws Exception {
        if(Sal<1000)
            throw new Exception("salary must be greater than 1000");
        this.Sal = Sal;
    }


    public double getda(){
        return this.Sal*0.4;
    }

    public double getpf(){
        return this.Sal+0.1;
    }

    public double calnetsalary(){
        return this.Sal+getda()+getpf();
    }
}