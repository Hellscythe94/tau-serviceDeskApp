$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/serviceDeskApp/Search%20for%20regex.feature");
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
  "name": "There are at least 3 of them",
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