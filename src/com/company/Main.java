package com.company;

import java.io.Console;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger logger = Logger.getLogger( "Application");
        logger.log(Level.WARNING, "This is a warning!");

    }
}
