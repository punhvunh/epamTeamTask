package com.epam.travel.controller.impl;

import com.epam.travel.controller.CommandProvider;
import com.epam.travel.controller.Command;
import com.epam.travel.controller.Controller;

public class ControllerImpl implements Controller {

    private CommandProvider provider = new CommandProvider();

    @Override
    public String doAction(String operation) {
        /** Request form  = "number of operation" */

        Command current = provider.getCommand(operation);

        return current.execute();
    }
}
