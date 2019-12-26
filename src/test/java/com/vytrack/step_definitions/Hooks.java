package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before // run before scenario
    public void setUP(){
        System.out.println("\n\tthis is coming before scenario");
    }

    @After // run after scenario
    public void tearDown(Scenario scenario) {
        System.out.println("This is coming from after scenario\n");
        // if scenario fails, take a screenshot
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        Driver.closeDriver();
    }

    @After("@sales_manager") // will run with only those scenarios that have this given tag
    public void tearDownSalesManager(){
        System.out.println("This is coming from after scenario for sale managers\n");
    }



}
