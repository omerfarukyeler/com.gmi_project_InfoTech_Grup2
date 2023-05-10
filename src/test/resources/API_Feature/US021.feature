@api
Feature: System should allow to read all countries

  @US021
  Scenario: User can read all countries and validate them one by one
    Given User sends get request for all countries
    Then User gets all countries and validate them one by one