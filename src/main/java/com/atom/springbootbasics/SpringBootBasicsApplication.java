package com.atom.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Letting Spring Boot know that this is the starting point of the application.
 */
@SpringBootApplication
public class SpringBootBasicsApplication {

    public static void main(String[] args) {
        /*
         * Start spring application context
         * Create a servlet container
         * Host this application in the servlet container
         * Performs class path scan
         * Starts Tomcat server
         */
        SpringApplication.run(SpringBootBasicsApplication.class, args);
    }

}
