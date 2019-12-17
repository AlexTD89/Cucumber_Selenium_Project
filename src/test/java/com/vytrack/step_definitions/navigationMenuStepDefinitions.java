package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class navigationMenuStepDefinitions {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("user is on the page");
    }

    @When("the user goes to Fleet, Vehicles")
    public void the_user_goes_to_Fleet_Vehicles() {
        System.out.println("opening Fleet, Vehicles");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void the_url_should_be_https_qa_vytrack_com_entity_Extend_Entity_Carreservation(Integer int1) {
        System.out.println("verifying url Vehicles");
    }

    @When("the user goes to Marketing, Campaigns")
    public void the_user_goes_to_Marketing_Campaigns() {
        System.out.println("opening Marketing, Campaign");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/campaign\\/")
    public void the_url_should_be_https_qa_vytrack_com_campaign(Integer int1) {
        System.out.println("verifying url for campaign");
    }

    @When("the user goes to Activities, Calendar Events")
    public void the_user_goes_to_Activities_Calendar_Events() {
        System.out.println("opening Activities, Calendar events");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/calendar\\/event")
    public void the_url_should_be_https_qa_vytrack_com_calendar_event(Integer int1) {
        System.out.println("verify url for Calendar events");
    }


}
