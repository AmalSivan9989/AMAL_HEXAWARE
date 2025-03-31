package com.hexaware.client;

import com.hexaware.dao.IDao;

public class Client {
    public static void main(String[] args) {

        IDao dao=IDao.getDaoInstance();
        dao.addEmp();
        dao.getEmp();
        System.out.println(dao.getClass().getSimpleName());
}}
