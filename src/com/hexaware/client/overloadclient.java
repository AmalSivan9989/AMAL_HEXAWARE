package com.hexaware.client;

import com.hexaware.util.mutil;

public class overloadclient {
    public static void main(String[] args) {
        double val=56.7897543;
        System.out.println(mutil.roundoff(val));
        System.out.println(mutil.roundoff(val,4));
    }
}
