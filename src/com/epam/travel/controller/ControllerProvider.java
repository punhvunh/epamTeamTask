package com.epam.travel.controller;


import com.epam.travel.controller.impl.ControllerImpl;

public class ControllerProvider {
    private static final ControllerProvider instance = new ControllerProvider();

    Controller controller = new ControllerImpl();

    private ControllerProvider(){
    }

    public static ControllerProvider getInstance() {
        return instance;
    }

    public Controller getController(){
        return controller;
    }

}
