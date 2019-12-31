Feature: Login as different user types

  Scenario: Driver user
    Given the user logs in as a "driver"
    When the user goes to "Activities" "Calendar Events"
    Then the title should contain "Calendar Events - Activities"

  Scenario: Driver user
    Given the user logs in as a "sales manager"
    When the user goes to "Costumers" "Accounts"
    Then the title should contain "Accounts - Customers"

  Scenario: Driver user
    Given the user logs in as a "store manager"
    When the user goes to "Costumers" "Accounts"
    Then the title should contain "Accounts - Customers"




    # test the login functionality using different users

  Scenario Outline: Test login with different types
    Given the user logs in as a "<usertype>"

    Examples:
      | usertype      |
      | driver        |
      | sales manager |
      | store manager |


  Scenario Outline: Test login with different types again <usertype>
    Given the user logs in as a "<usertype>"

    Examples:
      | usertype      |
      | driver        |
      | boss          |
      | store manager |


  Scenario Outline: Test login with different types again <usertype>
    Given the user logs in as a "<usertype>"
    When the user goes to "<tab>" "<module>"
    Then the title should contain "<title>"

    Examples:
      | usertype      | tab        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | store manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Accounts        | Accounts - Customers         |

    # to format the table: (MAC) OPT+CMD+L
    #                      (Win) ??


  Scenario Outline: Test login with different types again <usertype>
    Given the user logs in as a "<usertype>"
    When the user goes to "<tab>" "<module>"
    Then the title should contain "<title>"

    Examples:
      | usertype      | tab        | module          | title                                                              |
      | driver        | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System       |
      | driver        | Customers  | Accounts        | Accounts - Customers                                               |
      | driver        | Customers  | Contacts        | Contacts - Customers                                               |
      | driver        | Activities | Calendar Events | Calendar Events - Activities                                       |
      | driver        | System     | Jobs            | Jobs - System                                                      |
      | user          | tab        | module          | title                                                              |
      | sales manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | sales manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | All - Jobs - System                                                |
      | user          | tab        | module          | title                                                              |
      | store manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | store manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | All - Jobs - System                                                |


  Scenario Outline: Test login with different types again <usertype>
    Given the user logs in as a "<usertype>"
    When the user goes to "<tab>" "<module>"
    Then the title should contain "<title>"

    Examples:
      | usertype | tab        | module          | title                                                        |
      | driver   | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System |
      | driver   | Customers  | Accounts        | Accounts - Customers                                         |
      | driver   | Customers  | Contacts        | Contacts - Customers                                         |
      | driver   | Activities | Calendar Events | Calendar Events - Activities                                 |
      | driver   | System     | Jobs            | Jobs - System                                                |
    Examples:
      | usertype      | tab        | module          | title                                                              |
      | sales manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | sales manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | All - Jobs - System                                                |
    Examples:
      | usertype      | tab        | module          | title                                                              |
      | store manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | store manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | All - Jobs - System                                                |





  Scenario Outline: login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username | <username>  |
      | password | UserUser123 |
      | fname    | <firstname> |
      | lname    | <lastname>  |
    Then the user should be able to login

    Examples:
      | firstname | lastname | username        |
      | Parsa     | Mehdi    | salesmanager101 |
      | Rahwa     | Maaza    | storemanager85  |








