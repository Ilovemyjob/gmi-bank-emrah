@createDate
Feature: US_14


  Background:
    Given user is on GmiBank hompage
    When user clicks user icon
    And  user clicks sign in
    And user provide valid username
    And  user provide valid password
    And user clicks My operations

  Scenario:TC-14.1 The date cannot be typed earlier, in the past, at the time of creation an account
    When user clicks Manage Accounts
    And user clicks create new account button
    And user select a date
    Then verify that user cannot choose an earlier date

#  Scenario:TC-14.2 The date should be created as month, day, year, hour and minute
#    When user clicks Manage Accounts
#    And user clicks create new account button
#    When user selects a date
#    Then date should be created as  month,day,year , hour and minute
#
#
#  Scenario:TC-14.3 User can choose a user from the registration and it cannot be blank
#    When user clicks manage customers
#    And user clicks Edit button to edit a user
#    Then verify that user cannot be blank
#
#  Scenario:TC-14.4 There user can choose an account created on manage accounts
#    When user clicks manage customers
#    And user clicks Edit button to edit a user
#    Then verify that user can choose an account from accounts
#
#  Scenario:TC-14.5 User can select Zelle Enrolled optionally and save it
#    When user clicks manage customers
#    And user clicks Edit button to edit a user
#    And user should select Zella Enrolled
#    Then user should save it



