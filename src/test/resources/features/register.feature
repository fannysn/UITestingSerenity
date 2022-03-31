@Register
Feature: Register
  As a user
  I want to create new user account
  So that I can successfully login

  Scenario: As a User I have to be able to Register with new account
    Given I am on the Register Page
    When I input firstname & lastname
    And I input valid username
    And I input valid password
    And click button register
    Then I am on the Login Page