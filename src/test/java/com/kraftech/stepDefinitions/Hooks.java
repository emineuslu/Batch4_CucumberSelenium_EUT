package com.kraftech.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("This is coming from before method");
    }

    @After
    public void tearDown(){
        System.out.println("This is coming from after method");
    }

    @Before("@dataBase")
    public void openDataBase(){
        System.out.println("Open database");
    }

    @After("@dataBase")
    public void closeDataBase(){
        System.out.println("Close database");
    }
}
