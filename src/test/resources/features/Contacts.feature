Feature: Contacts page functionality


  Scenario: Default page number
    Given a driver is logged in
    When the user goes to "Costumers" "Contacts"
    Then Default page number should be 1


  Scenario: Menu Options
    Given a driver is logged in
    Then  the user should see following menu options
      | Fleet | Customers | Activities | System |


  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username | user1       |
      | password | UserUser123 |
      | fname    | Mizgin      |
      | lname    | Ayaz        |
    Then the user should be able to login

  @wip
  Scenario Outline: Login multiple times
    Given the user is on the login page
    When the user enters the "<user>" information
    Then the user should be able to login

    Examples:
      | user          |
      | saless manager |
      | store manager |



