package com.hexaware.entity;

public class inter {
    private double p,t,r,n;

    public double getP() {
        return p;
    }

    public void setP(double p) throws Exception {
        if (p < 1000) {
            throw new Exception("p should be above 1000");

        }
        this.p = p;
    }
    public double getT() {
        return t;
    }

    public void setT(double t) throws Exception{
        if (t < 2) {
            throw new Exception("t should be above 2");

        }
        this.t = t;
    }

    public double getR() {
        return r;
    }

    public void setR(double r)throws Exception {
        if (r < 2) {
            throw new Exception("r should be above 2");

        }
        this.r = r;
    }

    public double getN() {
        return n;
    }

    public void setN(double n)throws Exception {
        if (n < 2) {
            throw new Exception("n should be above 2");

        }
        this.n = n;
    }

    public double simpleinterest(double p, double t, double r){
        return (p*t*r)/100;
    }
    public double compoundinterest(double p,double t,double r,double n){
        return p*Math.pow(1+(r/(n*100)),n*t)-p;
    }


}
