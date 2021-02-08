@US_24
Feature:System should allow to create new states using api end point

  Scenario: User can Just create each state 1 by 1
    Given User enter API endpoint "https://www.gmibank.com/api/tp-states"
    Given User verifies statusCode as "200" and content type as "ContentType.JSON"
    And User send a POST request to REST API "https://www.gmibank.com/api/tp-states" as "ZK"
    Then User verifies the created state "ZK"









