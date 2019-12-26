package com.vytrack.step_definitions;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following menu options")
    public void the_user_should_see_following_menu_options(List<String> list) {
        System.out.println("list.size() = " + list.size());
        System.out.println(list);

        // get the actual values from UI
        DashBoardPage dashBoardPage = new DashBoardPage(); // object of the DashBoard Page

        List<String> actualList = new ArrayList<>(); // new list where we will insert the text values of the webelements
        BrowserUtils.waitFor(2);

        /**
         convert webElements to text,
         where menuOptions is a list, and we iterate through it converting the webelement to the String value
         to compare them with the Data Table of String from the Contacts.feature file Scenario
         */
        for (WebElement option : dashBoardPage.menuOptions) {
            actualList.add((option.getText()));
        }

        System.out.println(actualList);

        // compare actual list to the expected list
        Assert.assertEquals(list, actualList);
    }


    /**
     * This method will pass a Map with data (username, password, etc..)
     * will retrieve the data to be able to login with credentials
     *
     * @param userData
     */
    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userData) {
        System.out.println(userData);
        System.out.println("Firstname: " + userData.get("fname"));
        System.out.println("Firstname: " + userData.get("lname"));
        System.out.println("Username: " + userData.get("username"));
        System.out.println("Password: " + userData.get("password"));

        LoginPage loginPage = new LoginPage();
        loginPage.login(userData.get("username"), userData.get("password"));

    }
}
