Feature: London test
  I am a user
  I want to check the weather in London
  I want to come back to the main page
  I want to see my resent searches

  Scenario: Test Case Recent locations
    Given Accuweather main page is opened
    When I clean and write "London" in the search input
    And I click the first result
    When I click the logo to return to menu
    Then Main page is opened
    When I click on the first resent search
    Then I check that "London" is in the header of the page