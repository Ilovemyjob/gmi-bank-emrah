Feature: US_03

  @TEST_T28-79
  Scenario: US_03
    Given go to registration page
    Then enter lower case
    Then enter upper case
    Then enter a digit
    Then enter a special char
    Then total should be at least seven chars
    And close browser