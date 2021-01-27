@T28-53

Feature: A new Account Creation

  Background:
  #T28-58
    Given login as an employee
    Given user clicks my operation on employee page
    Given select Manage accounts
    Then click on Create a new account


  Scenario: TC_001 User should create a description for the new account and it cannot be blank
    Given user clicks on descriptionbox
    Given user should let the descriptionBox blank
    Then assert description error message "This field is required."
    Then provide a data for description "New edition"


  Scenario: TC_002 User should provide a balance for the first time account creation as Dollar
    Given user clicks on balanceBox
    Given user should let the balanceBox blank
    Then verify balance error message "This field is required."
    Then provide a data for balanceBox "500"

  Scenario: TC_003 User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
    Given user clicks on account type
    Given user should select the option SAVING
    Then verify that option is selected "SAVING"

  Scenario:  TC_004 Account status should be defined as ACTIVE, SUSPENDED or CLOSED
    Given user clicks on account status type
    Given user should define the option "CLOSED"
    Then  verify that option is defined "CLOSED"

  Scenario:  TC_005 User can select an employee from the drop-down
    Given user clicks on employeebox
    Given should select an employee
    Then verify that employee selected "Saski"

  Scenario: Tc
    Given provide a data for description "New edition"
    Given provide a data for balanceBox "500"
    Given user should select the option SAVING
    Given user should define the option "CLOSED"
    Given should select an employee

