@US014
Feature: US_014 Date should be created on the time of account creation

  Background:
    Given Go to the GmiBank home page
    When you should navigate to sign in page
    And  Provide the username of the applicant as employee
    And Provide the password of the applicant
    And  Click on Sign In
    And Click on My Operations
    And Click on Manage Customer
    And Click on Create a New Customer

  Scenario: TC01_The date cannot be typed earlier, in the past, at the time of creation an account
    When Provide the invalid date in the past at the time of creation an account
    And Fill in the other fields
    And Click on Save Button
    Then You should see the error message
    And Click on Sign Out

  Scenario:TC02_The date can be type at the time of creation an account
    When Provide the invalid date in the past at the time of creation an account
    And Fill in the other fields
    And Click on Save Button
    Then You should not see the error message
    And Click on Sign Out

  Scenario:TC03_The date should be created as month, day, year, hour and minute
    Then The date should be created as month, day, year, hour and minute
    And Click on Sign Out

  Scenario: TC04_User can choose a user from the registration and it cannot be blank
    Then You can choose a user from the registration
    And Click on Sign Out

  Scenario: TC05_User can choose a user from the registration and it cannot be blank
    When Fill in the other fields
    And Click on Save Button
    Then user from the registration cannot be blank you should see the error message
    And Click on Sign Out

  Scenario: TC06_There user can choose an account created on manage accounts
    Then you can choose an account created on manage accounts
    And Click on Sign Out

  Scenario: TC07_User can select Zelle Enrolled optionally and save it
    When User can select Zelle Enrolled optionally
    And Fill in the other fields
    And Click on Save button
    Then you should succesfully saved
    And Click on Sign Out



