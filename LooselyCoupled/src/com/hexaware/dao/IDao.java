package com.hexaware.dao;

import java.util.ResourceBundle;

public interface IDao {
    void addEmp();
    void getEmp();
    static IDao getDaoInstance(){
        // resource bundle will scan hexa.properties file
        //load hexa.properties
        ResourceBundle rb=ResourceBundle.getBundle("hexa");

        //read cname key
        String clsname=rb.getString("cname");
        IDao dao = null;
        try {
            Class cls =Class.forName(clsname);//load the class programatically
            dao = (IDao)cls.newInstance();//create the intance

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {

            e.printStackTrace();
        }
        return dao;
    }}