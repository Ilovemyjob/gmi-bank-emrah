@US20
Feature:
  Scenario: System should allow to create customers using api endpoint
    Given user set and read customers endpoint with valid token
    And   user verifies customers data  with data set from database
    Then user validates customers data one by one from database