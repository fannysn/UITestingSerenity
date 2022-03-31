@Login
Feature: Login
  As a user
  I want to login
  So that I can access my profile page

 Scenario: As a User I have to be able to login BookStore
   Given I am on the login page
   When I input valid Username
   And I input valid Password
   And click button login
   Then I am on the ProfilePage

  Scenario: Failed login
    When I input invalid Username
    And I input valid Password
    And click button login
    Then I can see error message "Invalid username or password!"