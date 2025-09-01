package org.stepic.level_3;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogDemo {

    private static final Logger LOGGER = Logger.getLogger(LogDemo.class.getName());
    public static void main(String[] args) {
        LOGGER.log(Level.FINE, "Started with args: {0}", Arrays.toString(args));
        LOGGER.setLevel(Level.ALL);

        try {
            randomlyFailingAlgorithm();
        } catch ( IllegalStateException e ){
            LOGGER.log(Level.SEVERE, "Exception caught", e);
            System.exit(2);
        }
        LOGGER.fine("Finished successfully");
    }

    private static void randomlyFailingAlgorithm(){
        double randomNumber = Math.random();
        LOGGER.log(Level.FINE, "Random number: {0}", randomNumber);
        if(randomNumber < 0.5){
            throw new IllegalStateException("Random number is less than 0.5");
        }
    }
}
