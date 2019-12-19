Feature: Contacts page functionality

  @wip
  Scenario: Default page number
    Given a driver is logged in
    When the user goes to "Costumers" "Contacts"
    Then Default page number should be 1