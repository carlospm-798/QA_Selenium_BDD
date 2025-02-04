Feature: Alerts
  I am a user
  I want to handle alert
  To be able to accept its

  Scenario: Alert handling
    Given I go to "JavaScript Alerts" on the Main Page
    When I generate JS alert on the JavaScript Alert Page
    And I accept the alert
    Then Success message is displayed on JavaScript Alert Page