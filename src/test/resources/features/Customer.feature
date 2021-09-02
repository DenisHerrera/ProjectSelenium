Feature: Administration customer

  Scenario: Login with customer
    Given Login page as customer is loaded
    When User selects his username
    And User clicks on login button
    Then User will see a scream to manage their accounts

  Scenario: See all transactions
    Given Main page of transactions is loaded
    When User clicks on transactions button
    Then User will see all transactions

  Scenario: Deposit in an account
    Given The section for deposit is loaded
    When User enters amount of deposit
    And User clicks on deposit button
    Then User will see a message confirming the deposit

  Scenario: withdraw money
    Given The section for withdraw is loaded
    When User enter amount of withdraw
    And User clicks on withdraw button
    Then User will see a massage confirming the withdraw

  Scenario: Logout
    Given One session is open
    When User clicks on logout button
    Then User will see the login page