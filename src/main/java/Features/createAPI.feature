Feature: Create API Feature

  Scenario Outline: Create API Test Scenario
    Given User is already on login page
    When Title of page is Simple Login
    Then User enters "<username>" and "<password>"
    Then User clicks on login button
    Then User is on home page
    Then User clicks on API Keys button
    Then User enters API Key name as "<api_key>"
    Then User clicks on Create button
    Then the card is created with name "<api_key_name>"
    Then Close the browser
    Examples:
      | username                 | password        | api_key | api_key_name |
      | anuraggarg2810@gmail.com | AnuragGarg@2893 | key4    | key4         |
      | anuraggarg2810@gmail.com | AnuragGarg@2893 | key5    | key5         |
      | anuraggarg2810@gmail.com | AnuragGarg@2893 | key6    | key6         |


