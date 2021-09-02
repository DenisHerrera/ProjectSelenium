Feature: Administration customer

  Scenario: Login with customer
    Given Login page as customer is loaded
    When User selects his username to login
    Then User will see a scream to manage their accounts

  Scenario: Deposit in an account
    Given The section for deposit is loaded
    When User enters amount to deposit
    Then User will see a message confirming the deposit

  Scenario: withdraw money
    Given The section for withdraw is loaded
    When User enter amount to withdraw
    Then User will see a massage confirming the withdraw

  #Scenario: Logout
  #  Given One session is open
   # When User clicks on logout button
   # Then User will see the login page