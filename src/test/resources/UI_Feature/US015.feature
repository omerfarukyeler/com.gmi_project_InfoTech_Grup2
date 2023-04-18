@US015
Feature: US_015 System should allow user to manage their account

  Background:
    Given Go to "https://gmibank.com/"
    When  you should navigate to sign in page
    And Provide the username of the applicant as user
    And Provide the password of the applicant
    And Click on Sign In


  Scenario: TC01_User should see all account types and balance populated

    And Click on My Operations
    And Click on Manage Account
    Then You should see all account types
    And Click on Sign Out


  Scenario: TC02_User should see all account types and balance populated
    And Click on My Operations
    And Click on Manage Account
    Then You should see all balance populated
    And Click on Sign Out

  Scenario: TC03_User can view transaction
    And Click on My Operations
    And Click on Manage Account
    Then You should see view transaction
    And Click on Sign Out



