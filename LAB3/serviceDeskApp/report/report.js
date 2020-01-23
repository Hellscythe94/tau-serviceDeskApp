$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/serviceDeskApp/DeleteByList.feature");
formatter.feature({
  "name": "Delete by List",
  "description": "  Deletes records in database by list of IDs",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A list of \u003cticketsToDelete\u003e IDs",
  "keyword": "Given "
});
formatter.step({
  "name": "I want to delete those records from the database",
  "keyword": "When "
});
formatter.step({
  "name": "The size of the database should be \u003csize\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ticketsToDelete",
        "size"
      ]
    },
    {
      "cells": [
        "6",
        "4"
      ]
    },
    {
      "cells": [
        "3",
        "7"
      ]
    },
    {
      "cells": [
        "1",
        "9"
      ]
    },
    {
      "cells": [
        "5",
        "5"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "A database with tickets",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aDatabaseWithTickets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are at least 10 of them",
  "keyword": "And "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.thereAreAtLeastOfThem(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A list of 6 IDs",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aListOfIDs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to delete those records from the database",
  "keyword": "When "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.iWantToDeleteTicketsToDeleteRecordsFromThe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The size of the database should be 4",
  "keyword": "Then "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.theSizeShouldBeFewerByTheTicketsToDelete(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "A database with tickets",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aDatabaseWithTickets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are at least 10 of them",
  "keyword": "And "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.thereAreAtLeastOfThem(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A list of 3 IDs",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aListOfIDs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to delete those records from the database",
  "keyword": "When "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.iWantToDeleteTicketsToDeleteRecordsFromThe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The size of the database should be 7",
  "keyword": "Then "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.theSizeShouldBeFewerByTheTicketsToDelete(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "A database with tickets",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aDatabaseWithTickets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are at least 10 of them",
  "keyword": "And "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.thereAreAtLeastOfThem(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A list of 1 IDs",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aListOfIDs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to delete those records from the database",
  "keyword": "When "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.iWantToDeleteTicketsToDeleteRecordsFromThe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The size of the database should be 9",
  "keyword": "Then "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.theSizeShouldBeFewerByTheTicketsToDelete(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "A database with tickets",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aDatabaseWithTickets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are at least 10 of them",
  "keyword": "And "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.thereAreAtLeastOfThem(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A list of 5 IDs",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aListOfIDs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to delete those records from the database",
  "keyword": "When "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.iWantToDeleteTicketsToDeleteRecordsFromThe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The size of the database should be 5",
  "keyword": "Then "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.theSizeShouldBeFewerByTheTicketsToDelete(int)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/serviceDeskApp/RegexSearch.feature");
formatter.feature({
  "name": "Search for regex",
  "description": "  User searches for a ticket Title using a regex",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "A database with tickets",
  "keyword": "Given "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.aDatabaseWithTickets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There are at least 10 of them",
  "keyword": "And "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.thereAreAtLeastOfThem(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to search for tickets with \"Issue \\d\\d\" in the title",
  "keyword": "When "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.iWantToSearchForTicketsWithInTheTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the Expected ticket with that \"Issue \\d\\d\" in the title",
  "keyword": "Then "
});
formatter.match({
  "location": "pl.edu.pjatk.tau.serviceDeskApp.RegexStepdefs.iShouldGetTheExpectedTicketWithThatInTheTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});