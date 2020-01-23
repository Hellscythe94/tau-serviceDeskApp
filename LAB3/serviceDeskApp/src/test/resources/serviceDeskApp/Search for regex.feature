Feature: Search for regex
  User searches for a ticket Title using a regex

  Scenario:
    Given A database with tickets
    And There are at least 3 of them
    When I want to search for tickets with "Issue \d\d" in the title
    Then I should get the Expected ticket with that "Issue \d\d" in the title
