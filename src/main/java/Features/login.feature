Feature: Simple Login Feature

  Scenario: Simple Login Test Scenario
    Given User is already on login page
    When Title of page is Simple Login
    Then User enters "anuraggarg2810@gmail.com" and "AnuragGarg@2893"
    Then User clicks on login button
    Then User is on home page
    Then Close the browser


