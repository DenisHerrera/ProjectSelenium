Feature: Bank Manager
  The bank manager can register a new customer and open accounts for him.

  Scenario: Register a customer
    Given The customer registration page is loaded
    When Manager fills required fields too add a new customer
    Then Manager will see a popup with the confirmation of register

  Scenario: Open account
    Given The open account page is loaded
    When Manager selects options to add new account
    Then Manager will see a popup with the confirmation of account created

  Scenario: Delete customer
    Given The customers page is loaded
    When Manager searches an account to delete
    Then Account deleted not will see in list of customers