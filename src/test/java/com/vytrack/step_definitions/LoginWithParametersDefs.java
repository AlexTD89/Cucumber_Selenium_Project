package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParametersDefs {

    @When("user logs is using {string} and {string}")
    public void user_logs_is_using_and(String username, String password) {
        System.out.println("string = " + username);
        System.out.println("string2 = " + password);
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("a driver is logged in")
    public void a_driver_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        new LoginPage().login(username, password);
    }

    @When("the user goes to {string} {string}")
    public void the_user_goes_to(String module, String submodule) {
        new DashBoardPage().navigateToModule(module, submodule);
    }

    @Then("Default page number should be {int}")
    public void default_page_number_should_be(Integer expectedCount) {
        BrowserUtils.waitFor(2);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualCount = Integer.parseInt(contactsPage.pageCount.getAttribute("value"));
        Assert.assertEquals(expectedCount, actualCount);

    }

}
