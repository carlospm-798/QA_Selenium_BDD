Feature: Current location test
  I am a user
  I want to check the weather in my current location

  Scenario: Test Case Current location label
    Given Accuweather main page is opened
    When I click the search field
    Then The current location label is displayed