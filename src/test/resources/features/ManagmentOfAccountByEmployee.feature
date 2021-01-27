@T28-70
#US09 & us10
Feature: Create a new customer
  Background:
    Given user is on GmiBank hompage
    And user clicks user icon
    And user clicks sign in
    And user provide valid username
    And user provide valid password
    And user clicks sign in button
    And user clicks on manage customer
    And user clics on create a new customer
#us09 =====================================
  Scenario: User can search for a new applicant by their SSN and see all their registration info populated
    And user type ssn number into ssnBox "555-55-5555"
    And user clicks on search button
    Then user verify that all user data provided

 #us10 ==============================================
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

#US11 ====================================
  @tc11_01
  Scenario Outline: Create Date negative test (for in the past)
    Given user send data to date box "<Create Date> "
    Then user verifies valid data entry to Create Date box
   # Then user signOut
    Examples: Test Dates
      | Create Date |
      | 12.12.2015 12:00 |
      | 01.20.2020 11:15 |
  @tc11_02
  Scenario Outline: TC_1102 Date format negative test
    Given user send invalid data format to date box "<Create Date Invalid>"
    Then user verifies invalid data entry to Create Date box
   # Then user signOut
    Examples: Test Dates
      | Create Date Invalid |
      | 01.12.2020 |
      | 01.20.2021 11 |
      | 11.2021 09:30 |
  @tc11_03
  Scenario Outline: TC_1103 Date format positive test
    Given user send valid data format to date box "<Create Date Valid>"
    And user verifies valid date format to Create Date box
  #  Then user signOut
    Examples: Test Dates
      | Create Date Valid |
      | 12.30.2020 12:00 |
      | 01.21.2021 11:15 |
  @tc11_04
  Scenario: User positive test
    Given user select a user from dropbox
    And user verifies a user can be selected
   # Then user signOut
  @tc11_05
  Scenario: Account positive test
    Given user select an account from dropbox
    And user verifies an account can be selected
  #  Then user signOut
  @tc11_06
  Scenario: Zelle Enrolled option checkbox positive test
    Given user select Zelle Enrolled checkbox
    And user click on save button
    And user verifies is selected
   # Then user signOut




