@T28-70

Feature: Create a new customer

  Scenario: User can search for a new applicant by their SSN and see all their registration info populated

    Given user is on GmiBank hompage
    And user clicks user icon
    And user clicks sign in
    And user provide valid username
    And user provide valid password
    And user clicks sign in button
    And user clicks on manage customer
    And user clics on create a new customer
    And user type ssn number into ssnBox "555-55-5555"
    And user clicks on search button
    Then user verify that all user data provided
