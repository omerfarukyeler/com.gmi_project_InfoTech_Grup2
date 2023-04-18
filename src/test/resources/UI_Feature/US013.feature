@US013
Feature: US_013 An Employee can create a new Account

  Background:
    Given Go to the GmiBank home page
    When you should navigate to sign in page
    And  Provide the username of the applicant as employee
    And Provide the password of the applicant
    And  Click on Sign In
    And Click on My Operations
    And Click on Manage Account
    And Click on Create a New Account

  Scenario: TC01_ User should create a description for the new account and it cannot be blank
    And Click on Description text box
    And Click on Balance text box
    Then You should see the error message under the textbox This field is required.
    And Click on Sign Out


  Scenario: TC04_User should provide a balance for the first time account creation as Dollar
    And  Click on Balance text box
    And Enter a character in the balance test box
    And Click on Account Type dropdown
    Then I should see the error message under the text box This field should be a number.
    And Click on Sign Out

  Scenario: TC05_User should provide a balance for the first time account creation as Dollar
    And  Click on Balance text box
    And Enter a special character in the balance test box
    And Click on Account Type dropdown
    Then I should see the error message under the text box This field should be a number.
    And Click on Sign Out

  Scenario: TC06_User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
    And Click on Account Type dropdown
    And I should select the an account type CHECKING
    And I should select the an account type SAVING
    And I should select the an account type CREDIT_CARD
    Then I should select the an acount type INVESTING
    And Click on Sign Out


  Scenario: TC07_Account status should be defined as ACTIVE, SUSPENDED or CLOSED
    And Click on Account Status dropdown
    And I should select the an account status ACTIVE
    And I should select the an account status SUSPENDED
    Then I should select the an account status CLOSED
    And Click on Sign Out


  Scenario: TC08_User can select an employee from the drop-down
    And Click on Employee dropdown
    Then You should select an employee from the drop-down
    And Click on Sign Out

  Scenario: TC02_ User should create a description for the new account and it cannot be blank
    And Click on Description text box
    And Enter a valid value in the definition test box
    And Click on Balance text box
    Then  You should not see the error message under the textbox This field is required.
    And Click on Sign Out


  Scenario: TC03_User should provide a balance for the first time account creation as Dollar
    When Click on Balance text box
    And Enter a a number in the balance test box
    And Click on Account Type dropdown
    Then I should not see the error message under the textbox This field should be a number.
    And Click on Sign Out