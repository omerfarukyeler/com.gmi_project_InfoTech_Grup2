@us17 @ui
Feature: System should allow the Admin to manage users

  Background:
    Given user goes to gmibank web address

  Scenario: Creating a new user
    When user clicks on account menu button
    And  user clicks on register link
    And  user fills out all credentials
    And  user clicks on register button
    Then system verifies that the user has been successfully created

  Scenario: Activating the new user
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on deactivated button to activate new user
    Then system confirm that activation has been completed
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Viewing the new user
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on view button
    Then system confirm that information of user can be seen
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Editing the new user
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    When user clicks on edit button
    And  user edits email
    And  user clicks on save button
    Then system confirm that editing has been completed
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Deleting the new user
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on delete button
    And user clicks on delete buttonTwo
    Then system confirms that the new user has been deleted

  Scenario: Creating a new employee
    When user clicks on account menu button
    And  user clicks on register link
    And  user fills out all credentials
    And  user clicks on register button
    Then system verifies that the user has been successfully created

  Scenario: Activating the new employee
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on edit button for employee
    And user selects role for user as employee
    And user clicks on save button for employee
    Then system confirms that editing has been completed for employee
    And user clicks on modifiedDate
    And user clicks on deactivated button to activate new user
    Then system confirm that activation has been completed
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Viewing the new employee
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on view button
    Then system confirm that information of user can be seen
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Editing the new employee
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    When user clicks on edit button
    And  user edits email
    And  user clicks on save button
    Then system confirm that editing has been completed
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Deleting the new employee
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on delete button
    And user clicks on delete buttonTwo
    Then system confirms that the new user has been deleted

  Scenario: Creating a new manager
    When user clicks on account menu button
    And  user clicks on register link
    And  user fills out all credentials
    And  user clicks on register button
    Then system verifies that the user has been successfully created

  Scenario: Activating the new manager
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on edit button for manager
    And user selects role for user as manager
    And user clicks on save button for manager
    Then system confirms that editing has been completed for manager
    And user clicks on modifiedDate
    And user clicks on deactivated button to activate new manager
    Then system confirm that activation has been completed
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Viewing the new manager
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on view button
    Then system confirm that information of user can be seen
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Editing the new manager
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    When user clicks on edit button
    And  user edits email
    And  user clicks on save button
    Then system confirm that editing has been completed
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Deleting the new manager
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on delete button
    And user clicks on delete buttonTwo
    Then system confirms that the new user has been deleted

  Scenario: Creating a new admin
    When user clicks on account menu button
    And  user clicks on register link
    And  user fills out all credentials
    And  user clicks on register button
    Then system verifies that the user has been successfully created

  Scenario: Activating the new admin
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on edit button for admin
    And user selects role for user as admin
    And user clicks on save button for admin
    Then system confirms that editing has been completed for admin
    And user clicks on modifiedDate
    And user clicks on deactivated button to activate new admin
    Then system confirm that activation has been completed
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Viewing the new admin
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on view button
    Then system confirm that information of user can be seen
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Editing the new admin
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    When user clicks on edit button
    And  user edits email
    And  user clicks on save button
    Then system confirm that editing has been completed
    And user clicks on administrator menu
    And user clicks on sign out link

  Scenario: Deleting the new admin
    When user clicks on account menu button
    And user clicks on sign in link
    And user sends "admin2023" to username box
    And user sends "Admin.Strator23" to password box
    And user clicks on sign in button
    And user clicks on administration link
    And user clicks on user management link
    And user clicks on modifiedDate
    And user clicks on delete button
    And user clicks on delete buttonTwo
    Then system confirms that the new user has been deleted