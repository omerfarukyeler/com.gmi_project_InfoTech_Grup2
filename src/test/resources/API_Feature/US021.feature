Feature: System should allow to read all countries

  Background:
    Given User sends get request for all countries

  @US021
  Scenario: User can read all countries and validate them
    Then User gets all countries and validate them

  #@US0210
  Scenario: User can read all countries and validate them one by one
    Then User gets all countries and validate them one by one