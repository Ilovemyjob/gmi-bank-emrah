
  Feature: Go to Registration Page
    Background: User go to Registration Page
      Given User go to GMI BAnk homepage
      And User go to Registration page

    @user2
    Scenario Outline: TC_01 Any field on the registration page should not be left blank
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
      Then user verifies SSN message
      Then user verifies firstname message
      Then user verifies lastname message
#      Then user verifies address message - no webelement
#      Then user verifies mobile phone number message -no webelement
      Then user verifies username message
      Then user verifies email message
      Then user verifies new password message
      Then user verifies confirmation password message
#      Then And user verifies the visibility of message

      Examples:  Data for TC_01
#eger konfirmation messagi gormezse assert edecez gorursek assert etmeyecez ama onu nasil alacaz
        | ssnNumber   | firstname | lastname | address       | mobilePhone  | username | email       | password |
        |             |           |          |               |              |          |             |          |
#        |           | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |
#        | 1585-785A |           | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |
#        | 1585-785. | Thomas    |          | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |
        | 158-57-8515 | Thomas    | Ziegler  |               | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |
        | 158-57-8516 | Thomas    | Ziegler  | Mainstreet 55 |              | thozie   | jokl@gmx.de | 123456   |
##        | 1585-785. | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 |          | jokl@gmx.de | 123456   |
#        | 1585-785. | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   |             | 123456   |
#        | 1585-785. | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de |          |
#        | 1585-785. | Thomas    | Ziegler  | Mainstreet 55 | 123-456-7890 | thozie   | jokl@gmx.de | 123456   |


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

        | ssnNumber | firstname | lastname  | address      | mobilePhone    | username  | email        | password |
        |1585-7854  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | jokl@gmx.de  | 123456   |
        |1585-785.  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | jokl@gmx.de  | 123456   |
        |1585-785A  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | jokl@gmx.de  | 123456   |


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

        | ssnNumber | firstname | lastname  | address      | mobilePhone    | username  | email        | password |
        |158-78-5422  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-789/   | thozie    | jokl@gmx.de  | 123456   |
        |158-78-5422  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-789.   | thozie    | jokl@gmx.de  | 123456   |
        |158-78-5422  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-789A   | thozie    | jokl@gmx.de  | 123456   |

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

        | ssnNumber | firstname | lastname  | address      | mobilePhone    | username  | email        | password |
        |158-57-8549  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | joklgmxde  | 123456   |
        |158-57-8549  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | jokl@gmxde  | 123456   |
        |158-57-8549  | Thomas    | Ziegler   |Mainstreet 55 | 123-456-7890   | thozie    | joklgmx.de  | 123456   |




        #burdakiler bug olarak bildirilebilir
    Scenario:TC_1.3 User Doesn't type Mobile phone Number
      Given User click the Mobile phone Number textbox
      And User Doesn't type the Mobile phone Number and pass the other step
      And User should see Error message -Your Mobile phone Number is required

    Scenario Outline: : TC_2 User type SSN number with char or spec char
      Given User click SSn textbox
      And User type "<SSN number>" and pass the other step
      And User should see Error message -Your SSN is invalid

      Examples:
        | SSN number|
        | 123-12-123.|
#        | 123-12-123a|
#        | 123-12-123@|
#        | 123-12-123^|
#        | 123-12-123%|



    Scenario Outline: : TC_3 User type Mobile Phone Number with char or spec char
      Given User click Mobile Phone Number textbox
      And User type Mobile Phone "<Number>" and pass the other step
      And User should see Error message -Your Mobile Phone Number is invalid
      Examples:
        | Number|
        | 111-111-111.|
        | 111-111-111a|
        | 111-111-111A|
        | 111-111-111$|


    Scenario Outline: : TC_4 User type Email without "@" sign and "." extensions
      Given User click Email textbox
      And User type Email "<Email>" and pass the other step
      And User should see Error message -This field is invalid

      Examples:
        | Email |
        | deneme@gmailcom |
        | denemegmail.com |
        | denemegmailcom |






