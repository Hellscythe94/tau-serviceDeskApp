package pl.edu.pjatk.tau.serviceDeskApp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.edu.pjatk.tau.serviceDeskApp.labone.data.DataBase;
import pl.edu.pjatk.tau.serviceDeskApp.labone.model.Ticket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

public class RegexStepdefs {

    private DataBase dataBase = new DataBase(new Ticket[]{});
    private Ticket searchedTicketByTitle;

    @Given("A database with tickets")
    public void aDatabaseWithTickets() {
        Ticket[] data = {new Ticket(0, "Issue 10 - Monitor problem", "00", "caller0", new Date()), new Ticket(1, "Request 10 - monitor", "11", "caller1", new Date()),
                new Ticket(2, "Issue - hard drive", "22", "caller2", new Date())};
        dataBase = new DataBase(data);
    }

    @And("There are at least {int} of them")
    public void thereAreAtLeastOfThem(int arg0) throws Exception {
        assertEquals(dataBase.readAll().size(), arg0);
    }

    @When("I want to search for tickets with {string} in the title")
    public void iWantToSearchForTicketsWithInTheTitle(String arg0) {
        searchedTicketByTitle = dataBase.findTicketByTitle("Issue\\s\\d\\d");
    }

    @Then("I should get the Expected ticket with that {string} in the title")
    public void iShouldGetTheExpectedTicketWithThatInTheTitle(String arg0) throws Exception{
        assertEquals(searchedTicketByTitle.getTitle(), dataBase.read(0).getTitle());
    }


}
