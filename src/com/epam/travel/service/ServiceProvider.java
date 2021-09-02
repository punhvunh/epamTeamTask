package com.epam.travel.service;


public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    /**
     * impl Objects goes here
     */

    private ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return instance;
    }




}
