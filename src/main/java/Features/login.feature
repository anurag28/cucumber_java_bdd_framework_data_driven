Feature: Simple Login Feature

  Scenario: Simple Login Test Scenario
    Given User is already on login page
    When Title of page is Simple Login
    Then User enters "<email id>" and "password"
    Then User clicks on login button
    Then User is on home page
    Then Close the browser


