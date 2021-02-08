
  Feature:
#    =================us24===========
#
    Scenario: User can Just create each state 1 by 1
      Given User enter API endpoint "https://www.gmibank.com/api/tp-states"
      Given User verifies statusCode as "200" and content type as "ContentType.JSON"
      And User send a POST request to REST API "https://www.gmibank.com/api/tp-states" as "ZK"
      Then User verifies the created state "ZK"

#      ==================us25 ================
#
    Scenario: System should allow to create new countries using api end point
      Given User set country endPoint with valid token
      And User can Just create each country 1 by 1
      Then User validate country which is created

#      ===============us 26 ==============
#
    Scenario Outline: User can just update each country 1 by 1
      Given  User enter Api endpoint  "https://www.gmibank.com/api/tp-countries"
      And User can PATCH request to REST API with endpoint "<newname>" and id <id>
      Then User verifies the updated country
      Examples:
        | newname | id |
        | France | 22316 |

#      ======================us27=====================
#

#    ===============us29================
#    database validation

    @T28_164
    Scenario: All users' information should be retrieved by database and verified
      Given User connects GMI database
      Given User read all user data from database
      Then user validate all user data

    @T28_165
    Scenario: All countries' info should be retrieved by database and validated
      Given User connects GMI database
      Given User read all countries infos from database
      Then user validate all countries infos

    @T28_166
    Scenario: All states should related to USA should be  retrieved by database and validated
      Given User connects GMI database
      Given User read all states of related to USA from database
      Then user validate all states of related to USA

#      =============us 30 ==========================
#      pdf

