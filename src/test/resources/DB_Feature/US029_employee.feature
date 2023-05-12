@us29_employee   @db
Feature: US029
  Background:
    Given employee connects to the database

  Scenario: employee  verified number of user table rows
    And employee  connects to the user table
    Then prints the total row count and verify
