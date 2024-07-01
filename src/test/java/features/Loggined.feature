
Feature: Login Page
  As a user of the system
  I should be able login with valid credentials
  So that I can log into my account

  Background: Navigate
    Given the user navigate to "Swag Labs" page

  Scenario: 1.Verify login with valid Credentials
    When the user enters "standard_user" in username field
    And  the user enters "secret_sauce" in password field
    And the user click on login button
    Then the user should see and able to view the product page

  Scenario: 2.Verify login with invalid username
    When the user enters "standard_user1" in username field
    And the user enters "secret_sauce" in password field
    And the user click on login button
    Then the user should see "Epic sadface: Username and password do not match any user in this service"

  Scenario: 3.Verify login with Invalid password
    When the user enters "standard_user" in username field
    And  the user enters "secret_sauce1" in password field
    And the user click on login button
    Then the user should see "Epic sadface: Username and password do not match any user in this service"

  @RegressionTest
  Scenario: 4.Verify login with Empty Credentials
    When the user enters "standard_user" in username field
    And the user enters "" in password field
    And the user click on login button
    Then the user should see "Epic sadface: Password is required"

  Scenario: 5.Verify login with Space in Credentials
    When the user enters "standard_ user" in username field
    And  the user enters "secret_ sauce" in password field
    And the user click on login button
    Then the user should see "Epic sadface: Username and password do not match any user in this service"

  @RegressionTest
 Scenario Outline: 6.Verify login with invalid Credentials using data driven
    When the user login with "<username>" username and "<password>" password
    Then the user should see "<expectedText>"

      Examples:
        | username       | password      | expectedText
        | standard_user1 | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
        | standard_user  | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
        | standard_user  |               | Epic sadface: Password is required                                        |
        |standard_ user  | secret_ sauce | Epic sadface: Username and password do not match any user in this service |