@InfoEdit
  Feature: User Info Edit
    Background: User goes to login page
      Given user goes to login page
      And user provide valid username "adminteam28"
      And user provide valid password "team28europe"
      Then user click sign in button


      Scenario Outline: TC_01_user can not update invalid email address
        Given user click to manage customers
        And user click to edit button
        And user send "<userEmailUpdate>" into the mail box
        And user click save button
        Then assert the email address

        Examples:
        | userEmailUpdate |
        | snnhbgmail.com |
        | snfs..fd@gmail.com |
        | dsafsd@gmailcom |
        |        @gmail.com |
        | asfsaf@gmail.     |

        @language
        Scenario: TC_02_There should not be an option of any other language than Turkish and English
          Given admin click to sign in
          And admin click user management
          And admin give an option language dropdown
          Then assert the languages