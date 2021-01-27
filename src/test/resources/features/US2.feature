Feature: Go to Registration Page

  Background: User go to Registration Page
    Given User go to GMI BAnk homepage
    And User go to Registration page


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


  @user2
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

  @user2
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



  @user2
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
