
Feature: verify Drop down box
  As a user of the system
  i should be able to use the Product sort dropdown
  So that i can sort the products and display the selected option

  Background: Navigate
    Given the user navigate to home page
    When the user login with "standard_user" username and "secret_sauce" password
    Then the user should see "be able to view the product page"


  @SmokeTest
  Scenario: 1. Verify the number of options in Product dropdown box
    Then the user must see the 4 options in the dropdown box

  @SmokeTest
  Scenario Outline: 2. Verify that the user can select an option from the dropdown
    When the user select "<Option>" option from the dropdown
    Then the user should see "<Option>" option is selected in the dropdown

    Examples:
      | Option |
      | Name (A to Z) |
      | Name (Z to A) |
      | Price (low to high) |
      | Price (high to low) |