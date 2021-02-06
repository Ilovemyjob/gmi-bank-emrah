Feature: All Applicants
  Scenario: System should allow to read all applicants using api endpoint
    Given user sets and reads applicants endPoint with valid token
    And user reads registrants you created and validate them from your data set
    Then User can read and validate each registrants one by one from your database