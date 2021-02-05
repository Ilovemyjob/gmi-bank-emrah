
#us08
Feature: Password segment on Homepage should be editable

  Background:
    Given user is on GmiBank hompage
    And user clicks user icon
    And user clicks sign in
    And user provide valid username
    And user provide valid password
    And user clicks sign in button
    And user clicks on account menu
    And user clicks on password

  @TC_0801
  Scenario: The old password should not be used
    Given user tpye current password "employee28"
    And user type new password "employee28"
    And user type new password again for confirmation "employee28"
    And user clicks on save button for password change
    Then verify that green approve massage not displayed


  @TC_0802
  Scenario:   There should be at least one lowercase char for stronger password and
  see the level chart change accordingly
    Given user tpye current password "employee28"
    And user type new password as "employee"
    And verify that password contains one lowercase char and the level chart change accordingly

  @TC_0803
  Scenario:  There should be at least one uppercase char and see the level  chart change accordingly
    Given user tpye current password "employee28"
    And user type new password as "Employee"
    And verify that password contains one uppercase char and the level chart change accordingly

  @TC_0804
  Scenario:  There should be at least one digit  and see the level  chart change accordingly
    Given user tpye current password "employee28"
    And user type new password as "Employee28"
    And verify that password contains one digit and the level chart change accordingly

  @TC_0805
  Scenario:  There should be at least one special char and see the level bar change accordingly
    Given user tpye current password "employee28"
    And user type new password as "Employee.28"
    And verify that password contains one special char and the level chart change accordingly

  @TC_0806
  Scenario:  There should be at least seven chars for a stronger password
    Given user tpye current password "employee28"
    And user type new password as "Employee.28"
    And verify that password contains at least seven chars and the level chart change accordingly

  @TC_0807
  Scenario:  The new password should be confirmed
    Given user tpye current password "employee28"
    And user type new password as "Employee.28"
    And user type new password again for confirmation as "Employee.28"
    And verify that password succesfully changed.




