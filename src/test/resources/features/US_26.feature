@US_26

  Feature: System should allow to update countries using api end point

    Scenario Outline: User can just update each country 1 by 1
      Given  User enter Api endpoint  "https://www.gmibank.com/api/tp-countries"
      And User can PATCH request to REST API with endpoint "<newname>" and id <id>
      Then User verifies the updated country
      Examples:
      | newname | id |
      | France | 22316 |

