Feature: Search for regex

Scenario:
Given A database with 10 tickets
When I want to search for tickets with "Issue \d\d" in the title
Then I should get the Expected ticket with that regex match in the title