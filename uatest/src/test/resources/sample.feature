Feature: Select a POS
  A POS should be selected for proper billing

  Scenario: At least one POS is displayed
    Given the screen is POS
    Then I should at least one POS option
