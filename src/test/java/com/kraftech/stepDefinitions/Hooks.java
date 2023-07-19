package com.kraftech.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before(order = 0)
    public void setUp(){
        System.out.println("This is coming from before method");
    }

    @After(order = 0)
    public void tearDown(){
        System.out.println("This is coming from after method");
        //if block
    }

    @Before(value = "@dataBase", order = 1)
    public void openDataBase(){
        System.out.println("Open database");
    }

    @After(value = "@dataBase", order = 1)
    public void closeDataBase(){
        System.out.println("Close database");
    }
}
