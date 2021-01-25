Feature: US_001 Success register with valid credentials

  Background: User lands gmibank homepage
    Given user is on GmiBank hompage
    And user clicks user icon
    Then user clicks on register link

  @TC28-63..69
  Scenario Outline: User should type all valid data
    Given User type valid SSN in "<ssn>"
    And User type valid name in "<name>"
    And User type valid lastname in "<lastname>"
    And User type valid address in "<address>"
    And User type valid mobilephone number in "<mobile phone number>"
    And User type valid username in "<username>"
    And User type valid email in "<email>"
    And User type valid password "<firstPassword>"
    And User type valid second password "<secondPassword>"
    Then Assert that all data is valid
    Examples:
      | ssn         | name | lastname | address              | mobile phone number | username     | email                  | firstPassword | secondPassword |
      | 223-58- | John | Black    | Flower street. No 23 | 456-589-5986        | johnblack001 | johnblack001@gmail.com | 123456.Aa     | 123456.Aa      |




