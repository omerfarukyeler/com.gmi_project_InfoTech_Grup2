@US029_customer
Feature: US029

  Background:
    Given user connects to the database

  @db
  Scenario: user verified number of customer table rows
    Given user connects to the customer table
    Then print the total customers table row count and verify
  Scenario: user verified first row in customer table
    And user connects to the customer table
    Then print first customer name and verify
  Scenario: user verified last row in user table
    And user connects to the customer table
    Then print last customer name and verify
  Scenario: user verified specific row in user table
    When user connects to the customer table
    Then print specific customer name and verify