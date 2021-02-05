@US27
Feature:
  Scenario:
    Given user sets and reads states endPoint with valid token
    And user delete each state one by one
    Then user verifies that each state is deleted