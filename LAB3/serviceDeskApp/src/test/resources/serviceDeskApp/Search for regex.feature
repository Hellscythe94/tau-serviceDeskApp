Feature: Search for regex
  User searches for a ticket Title using a regex

  Background:
    Given A database with tickets
    And There are at least 10 of them

  Scenario:
  Given I need to find tickets that contain a "specifc phrase"
  When I try to search for that "specific phrase"
  Then I should get the Expected ticket with that "specific phrase" in the title
