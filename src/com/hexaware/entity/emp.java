package com.hexaware.entity;

public class emp {
    private int emp_id;
    private String emp_name;
    private double emp_sal;

    public static int count;
    public static double sum;

    public emp(int emp_id, String emp_name, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
        ++count;
        sum+=this.emp_sal;

    }
}
