@login #if call this tag, will run all scenarios from this file
Feature: User should be able to login

  @driver @VYT-123 #tag
  Scenario: Login as driver
    Given the user is on the page
    When the user enters the driver information
    Then the user should be able to login

  @sales_manager @VYT-123 # we can give 2 tags to the test, and call it in tags option by any of these 2 tags
  Scenario: login as a sales manager
    Given the user is on the page
    When the user enters the sales manager information
    Then the user should be able to login

    @store_manager
  Scenario: login as a store manager
    Given the user is on the page
    When the user enters the store manager information
    Then the user should be able to login





