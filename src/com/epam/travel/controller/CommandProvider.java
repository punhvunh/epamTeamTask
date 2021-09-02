package com.epam.travel.controller;


import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        /**
         * commands.put();
         * here goes methods for execution
         */

    }

    public Command getCommand(String operation) {
        return commands.get(operation);
    }
}
