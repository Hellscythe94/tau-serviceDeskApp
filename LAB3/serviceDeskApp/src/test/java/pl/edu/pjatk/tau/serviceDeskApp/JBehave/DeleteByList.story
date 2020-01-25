Feature: Delete by List

Scenario Outline:
Given A database with 10 tickets
Given A list of [ticketsToDelete] IDs
When I want to delete those records from the database
Then The size of the database should be [size]

Examples:
| ticketsToDelete  | size |
| 6                | 4    |
| 3                | 7    |
| 1                | 9    |
| 5                | 5    |
