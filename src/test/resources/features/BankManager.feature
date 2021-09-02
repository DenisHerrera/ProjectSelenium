Feature: Bank Manager
  The bank manager can register a new customer and open accounts for him.

  Scenario: Register a customer
    Given The customer registration page is loaded
    When Manager fills required fields
    And Manager clicks on add customer button
    Then Manager will see a popup with the confirmation of register

  Scenario: Open account
    Given The open account page is loaded
    When Manager selects options on the required fields
    And Manager clicks on process button
    Then Manager will see a popup with the confirmation of account created

  Scenario: Delete customer
    Given The customers page is loaded
    When Manager searches an account
    And Manager clicks on delete button
    Then Account deleted not will see in list of customers