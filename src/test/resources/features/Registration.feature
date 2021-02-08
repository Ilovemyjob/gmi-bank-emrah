
#us1 & us2
Feature: US_001 Success register with valid credentials

  Background: User lands gmibank homepage
    Given user is on GmiBank hompage
    And user clicks user icon
    Then user clicks on register link

  @TC28-63..69
  Scenario Outline: User should type all valid data
    Given user is on GmiBank hompage
    And user clicks user icon
    Then user clicks on register link
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
      | ssn     | name | lastname | address              | mobile phone number | username     | email                  | firstPassword | secondPassword |
      | 223-58- | John | Black    | Flower street. No 23 | 456-589-5986        | johnblack001 | johnblack001@gmail.com | 123456.Aa     | 123456.Aa      |

    #us2 ==================================================================
  @user2
  Scenario Outline: TC_01_deneme Any field on the registration page should not be left blank
    And User enters SSN number "<ssnNumber>"
    And user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters address "<address>"
    And user enters mobile phone "<mobilePhone>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters new password "<password>"
    And user enters new password confirmation "<password2>"
    And user clicks register
    And user should not registration

    Examples:  Data for TC_01
#eger konfirmation messagi gormezse assert edecez gorursek assert etmeyecez ama onu nasil alacaz
      | ssnNumber | firstname | lastname | address       | mobilePhone  | username | email       | password | password2 |
#|           |           |          |               |              |          |             | 123456   |    123456       |
      |           | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   | 123456    |
#| 158-78- |           | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |     123456      |
#| 158-78- | Thomas    |          | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |    123456       |
      | 158-57-1234 | Thomas    | Ziegler  |               | 123-456-7890 | thozie   | jokl@gmx.de | 123456   | 123456    |
#| 158-57-   | Thomas    | Ziegler  | Mainstreet 55 |              | thozie   | jokl@gmx.de | 123456   |  123456         |
#| 158-57-   | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 |          | jokl@gmx.de | 123456   |   123456        |
#| 158-57-   | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   |             | 123456   |   123456        |
#| 158-57-   | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de |          | 123456    |
#| 158-57-   | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |           |



  Scenario Outline: TC_02 SSN number cannot be of any chars nor spec chars except "-"

    And User enters SSN number "<ssnNumber>"
    And user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters address "<address>"
    And user enters mobile phone "<mobilePhone>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters new password "<password>"
    And user enters new password confirmation "<password>"
    And user clicks register
    Then User verifies the SSN invalid message

    Examples:  Data for TC_02

      | ssnNumber | firstname | lastname | address       | mobilePhone  | username | email       | password |
      | 1585-7854 | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |
#        |1585-785.  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | jokl@gmx.de  | 123456   |
#        |1585-785A  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | jokl@gmx.de  | 123456   |


  Scenario Outline: TC_03 Mobilephone number cannot be of any chars nor spec chars except "-"

    And User enters SSN number "<ssnNumber>"
    And user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters address "<address>"
    And user enters mobile phone "<mobilePhone>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters new password "<password>"
    And user enters new password confirmation "<password>"
    And user clicks register
    Then User verifies the Mobilephone number invalid message

    Examples:  Data for TC_03

      | ssnNumber   | firstname | lastname | address       | mobilePhone  | username | email       | password |
      | 158-78-5422 | Thomas    | Ziegler  | Mainstreet 55 | 123-456-789/ | thozie   | jokl@gmx.de | 123456   |
      | 158-78-5422 | Thomas    | Ziegler  | Mainstreet 55 | 123-456-789. | thozie   | jokl@gmx.de | 123456   |
      | 158-78-5422 | Thomas    | Ziegler  | Mainstreet 55 | 123-456-789A | thozie   | jokl@gmx.de | 123456   |




  Scenario Outline: TC_04 email id cannot be created without "@" sign and "." extensions

    And User enters SSN number "<ssnNumber>"
    And user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters address "<address>"
    And user enters mobile phone "<mobilePhone>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters new password "<password>"
    And user enters new password confirmation "<password>"
    And user clicks register
    Then User verifies the email invalid message

    Examples:  Data for TC_04

      | ssnNumber   | firstname | lastname | address       | mobilePhone  | username | email      | password |
      | 158-57-8549 | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | joklgmxde  | 123456   |
      | 158-57-8549 | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmxde | 123456   |
      | 158-57-8549 | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | joklgmx.de | 123456   |




