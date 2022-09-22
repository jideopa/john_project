@debug
Feature: Login

  Scenario: Successful Login
    Given user is on the login page
    When user enter a valid data email "pomtesting12345@gmail.com" and password "superman"
    Then user should be login