package pl.edu.pjatk.tau.serviceDeskApp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.edu.pjatk.tau.serviceDeskApp.labone.data.DataBase;
import pl.edu.pjatk.tau.serviceDeskApp.labone.model.Ticket;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class RegexStepdefs {

    private DataBase dataBase = new DataBase(new Ticket[]{});

    @Given("A database with tickets")
    public void aDatabaseWithTickets() {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        dataBase = new DataBase(data);
    }

    @And("There are at least {int} of them")
    public void thereAreAtLeastOfThem(int arg0) throws Exception {
        assertEquals(dataBase.readAll().size(), arg0);
    }

    @Given("I need to find tickets that contain a {string}")
    public void iNeedToFindTicketsThatContainA(String arg0) {

    }

    @When("I try to search for that {string}")
    public void iTryToSearchForThat(String arg0) {
    }

    @Then("I should get the Expected ticket with that {string} in the title")
    public void iShouldGetTheExpectedTicketWithThatInTheTitle(String arg0) {
    }
}
