Feature: New York test
  I am a user
  I want to check the weather in New York

  Scenario: Test Case Search city
    Given Accuweather main page is opened
    When I clean and write "New York" in the search input
    Then Search result list is displayed
    When I click the first result
    Then I check that "New York" is in the header of the page