@us29_country
Feature: US029
  Background:
    Given user connects to the database
  @db
  Scenario: user verified number of country table rows
    And user connects to the country table
    Then print the total row country count and verify
  Scenario: user verified first row in country table
    And user connects to the country table
    Then print first country name and verify
  Scenario: user verified last row in country table
    And user connects to the country table
    Then print last country name and verify
  Scenario: user verified spesific row in country table
    When user connects to the country table
    Then print spesific country name and verify