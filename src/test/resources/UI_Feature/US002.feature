Feature: System should not allow anyone to register with invalid credentials
  seeing the message

  Background:
    Given User goes to home pages

    @US002
      @First
    Scenario: Any field on the registration page should not be left blank

      When User clicks the user button
      And User clicks on register tab
      And User leaves SSN number blank
      And User leaves First Name blank
      And User leaves Last Name blank
      And User leaves Adress blank
      And User leaves Phone Number blank
      And User leaves Username blank
      And User leaves Email blank
      And User leaves New password blank
      And User leaves New password confirmation blank
      Then User checks the  social security number failed
      Then User checks the   first name failed
      Then User checks the   last name failed
      Then User checks the   address failed
      Then User checks the   mobile phone number failed
      Then User checks the  username failed
      Then User checks the  email failed
      Then User checks the  password failed
      Then User checks the  new password failed

      @US002
       @Second
      Scenario: SSN number cannot be of any chars nor spec chars except "-"
        When User clicks the user button
        And User clicks on register tab
        And User puts a special character other than "-" between numbers
        Then User checks the  social security number other failed

        @US002
        @Third
          Scenario: Mobilephone number cannot be of any chars nor spec chars except "-"
          When User clicks the user button
          And User clicks on register tab
          And User puts a special character other than "-" between telephone  numbers
          Then User checks the  telephone number other failed
        @US002
        @Fourth
          Scenario: email id cannot be created without "@" sign and "." extensions
          When User clicks the user button
          And User clicks on register tab
          And User puts a special character without "@" and "."
          Then User checks the  email other failed











