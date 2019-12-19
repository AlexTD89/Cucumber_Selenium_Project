package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before // run before scenario
    public void setUP(){
        System.out.println("\n\tthis is coming before scenario");
    }

    @After // run after scenario
    public void tearDown(){
        System.out.println("\tThis is coming from after scenario\n");
        Driver.closeDriver();
    }

    @After("@sales_manager") // will run with only those scenarios that have this given tag
    public void tearDownSalesManager(){
        System.out.println("This is coming from after scenario for sale managers\n");
    }



}
