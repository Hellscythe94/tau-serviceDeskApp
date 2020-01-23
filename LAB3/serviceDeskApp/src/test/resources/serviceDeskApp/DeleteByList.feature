Feature: Delete by List
  Deletes records in database by list of IDs

  Background:
    Given A database with tickets
    And There are at least 10 of them

  Scenario Outline:
    Given A list of <ticketsToDelete> IDs
    When I want to delete those records from the database
    Then The size of the database should be <size>

    Examples:
      | ticketsToDelete  | size |
      | 6                | 4    |
      | 3                | 7    |
      | 1                | 9    |
      | 5                | 5    |

