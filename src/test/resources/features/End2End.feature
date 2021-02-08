@demo2
  Feature: Demo
  Scenario: register
    Given applicant is on register page
    Given applcant provide all required data adn click  register

  Scenario:  employee create an account
    Given login as an employee
    Given user on accoun creation page
    Given provide all data and save

  Scenario: employee create costomer
    Given login as an employee
    Given user is on cutomer creatin page
    Then provide all info and click save

  Scenario: money tranfer
    Given User go to GMI BAnk homepage
    And user clicks user icon
    And user clicks sign in
    And user provide valid costumername
    And user provide valid costomerpassword
    And user clicks sign in button
    And user go to transfer money page
    Given user click account box
    And user can select first account
    And user select second box
    And user type balance
    And user type description
    And user make transfer

#    =====buranin altina pdf iin  feature file ini kiyalim



