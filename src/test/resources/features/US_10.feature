@US_10

Feature: Address of customer can be created

  Background:

    Given user is on GmiBank hompage
    And user clicks user icon
    And user clicks sign in
    And user provide valid username
    And user provide valid password
    And user clicks sign in button
    And user clicks on manage customer
    And user clics on create a new customer

  @TC_1001
  Scenario: Address as street and number should be provided  and cannot be left blank
    Given user clicks in address box
    And user clicks in city box
    Then verify error message "This field is required."

  @TC_1002
  Scenario: City should be provided and cannot be left as blank
    Given user clicks in city box
    And user clicks in address box
    Then verify error message under city box "This field is required."

  @TC_1003
  Scenario: Country should be typed and cannot be blank
    Given user type all valid data without country
    And user clicks on save button
    Then verify success massege not displayed

  @TC_1004
  Scenario: State should be provided as US state and cannot be blank
    Given user type all valid data without state
    And user clicks on save button
    Then verify success massege not displayed



