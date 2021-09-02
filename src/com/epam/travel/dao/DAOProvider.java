package com.epam.travel.dao;


public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();


    private DAOProvider() {
    }

    public static DAOProvider getInstance() {
        return instance;
    }



}
