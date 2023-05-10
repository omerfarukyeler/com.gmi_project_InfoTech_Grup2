@us29   @db
Feature: US029
  Background:
    Given user connects to the database

  Scenario: user verified number of user table rows
    And user connects to the user table
    Then print the total row count and verify
  Scenario: user verified first row in user table
    And user connects to the user table
    Then print first user name and verify
  Scenario: user verified last row in user table
    And user connects to the user table
    Then print last user name and verify
  Scenario: user verified spesific row in user table
    When user connects to the user table
    Then print spesific user name and verify