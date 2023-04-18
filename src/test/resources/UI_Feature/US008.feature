Feature: Password segment on Homepage should be editable

  Background:
    Given User goes GmiBank home page

  @US008
  Scenario: User cannot use the old password

    When User clicks dropdown account menu
    And User clicks on the Sign in
    And User types the valid username in the relevant field
    And User types the valid password in the relevant field
    And User clicks on Sign in button
    And User clicks dropdown account menu
    And User clicks on Password
    And User types the current password in the current password box
    And User types the current password in the new password box
    And User clicks the new password confirmation box
    Then User sees new password should be different from the current one error message

  #@US0081
  Scenario: User must type at least one lowercase letter for stronger password and should see the level table change accordingly

    When User clicks dropdown account menu
    And User clicks on the Sign in
    And User types the valid username in the relevant field
    And User types the valid password in the relevant field
    And User clicks on Sign in button
    And User clicks dropdown account menu
    And User clicks on Password
    And User types the current password in the current password box
    And User types one lowercase letter for password in the new password box
    Then User sees strength level does not change

  #@US0082
  Scenario: User must type at least one uppercase letter for stronger password and should see the level table change accordingly

    When User clicks dropdown account menu
    And User clicks on the Sign in
    And User types the valid username in the relevant field
    And User types the valid password in the relevant field
    And User clicks on Sign in button
    And User clicks dropdown account menu
    And User clicks on Password
    And User types the current password in the current password box
    And User types at least one uppercase letter for password in the new password box
    Then User sees strength level is second level

  #@US0083
  Scenario: User must type at least one digit for stronger password and should see the level table change accordingly

    When User clicks dropdown account menu
    And User clicks on the Sign in
    And User types the valid username in the relevant field
    And User types the valid password in the relevant field
    And User clicks on Sign in button
    And User clicks dropdown account menu
    And User clicks on Password
    And User types the current password in the current password box
    And User types at least one digit for password in the new password box
    Then User sees strength level is third level

  #@US0084
  Scenario: User must type at least one special char for stronger password and should see the level table change accordingly

    When User clicks dropdown account menu
    And User clicks on the Sign in
    And User types the valid username in the relevant field
    And User types the valid password in the relevant field
    And User clicks on Sign in button
    And User clicks dropdown account menu
    And User clicks on Password
    And User types the current password in the current password box
    And User types at least one special char for password in the new password box
    Then User sees strength level is fourth level

  #@US0085
  Scenario: User must type at least seven char for stronger password and should see the level table change accordingly

    When User clicks dropdown account menu
    And User clicks on the Sign in
    And User types the valid username in the relevant field
    And User types the valid password in the relevant field
    And User clicks on Sign in button
    And User clicks dropdown account menu
    And User clicks on Password
    And User types the current password in the current password box
    And User types at least seven char for password in the new password box
    Then User sees strength level is fifth level


  #@US0086
  Scenario: User can use the old password

    When User clicks dropdown account menu
    And User clicks on the Sign in
    And User types the valid username in the relevant field
    And User types the valid password in the relevant field
    And User clicks on Sign in button
    And User clicks dropdown account menu
    And User clicks on Password
    And User types the current password in the current password box
    And User types the valid new password in the new password box
    And User types the valid new password in the new password confirmation box
    And User clicks on the save button
    Then User confirms new password



