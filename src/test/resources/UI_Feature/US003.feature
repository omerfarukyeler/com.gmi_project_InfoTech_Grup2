Feature: Registration page should restrict password usage to a secure
  and high level passcode

  Background:
    Given User goes to home pages

    @USOO3

    Scenario: There should be at least 1 lowercase char for stronger password and
    see the level chart change accordingly

      When User clicks the user button
      And User clicks on register tab
      And User puts a lowercase char in new password
      Then User see the level chart change accordingly

     Scenario: There should be at least 1 uppercase char and see the level  chart change accordingly

       When User clicks the user button
       And User clicks on register tab
       And User puts a uppercase char in new Password
       Then User see the level chart change accordingly

     Scenario: There should be at least 1 digit  and see the level  chart change accordingly
       When User clicks the user button
       And User clicks on register tab
       And User puts a 1 digit in the new password
       Then User see the level chart change accordingly

     Scenario: There should be at least 1 special char and see the level bar change accordingly
       When User clicks the user button
       And User clicks on register tab
       And User puts a special character in new password
       Then User see the level chart change accordingly

     Scenario: There should be at least 7 chars for a stronger password

       When User clicks the user button
       And User clicks on register tab
       And User puts  new password
       Then check that the entered password is at least 7 long

