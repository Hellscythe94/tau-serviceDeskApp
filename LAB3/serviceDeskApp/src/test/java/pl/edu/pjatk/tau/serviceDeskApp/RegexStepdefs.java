package pl.edu.pjatk.tau.serviceDeskApp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.edu.pjatk.tau.serviceDeskApp.labone.data.DataBase;
import pl.edu.pjatk.tau.serviceDeskApp.labone.model.Ticket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class RegexStepdefs {

    private DataBase dataBase = new DataBase(new Ticket[]{});
    private Ticket searchedTicketByTitle;
    private ArrayList<Integer> IDs;
    private int ticketsToDelete;

    @Given("A database with tickets")
    public void aDatabaseWithTickets() {
        Ticket[] data = {
                new Ticket(0, "Issue 10 - Monitor problem", "00", "caller0", new Date()),
                new Ticket(1, "Request 11 - monitor", "11", "caller1", new Date()),
                new Ticket(2, "Issue 12 - hard drive", "22", "caller2", new Date()),
                new Ticket(3, "Issue 13 - Docking problem", "33", "caller3", new Date()),
                new Ticket(4, "Request 14 - access", "44", "caller4", new Date()),
                new Ticket(5, "Issue 15 - keyboard problem", "55", "caller5", new Date()),
                new Ticket(6, "Request 16 - password reset", "66", "caller6", new Date()),
                new Ticket(7, "Request 17 - password reset", "77", "caller7", new Date()),
                new Ticket(8, "Issue 18 - mouse problem", "88", "caller8", new Date()),
                new Ticket(9, "Request 19 - monitor purchase", "99", "caller9", new Date())};
        dataBase = new DataBase(data);
    }

    @And("There are at least {int} of them")
    public void thereAreAtLeastOfThem(int arg0) throws Exception {
        assertEquals(dataBase.readAll().size(), arg0);
    }

    //Regex feature//

    @When("I want to search for tickets with {string} in the title")
    public void iWantToSearchForTicketsWithInTheTitle(String arg0) {
        searchedTicketByTitle = dataBase.findTicketByTitle("Issue\\s\\d\\d");
    }

    @Then("I should get the Expected ticket with that {string} in the title")
    public void iShouldGetTheExpectedTicketWithThatInTheTitle(String arg0) throws Exception{
        assertEquals(searchedTicketByTitle.getTitle(), dataBase.read(8).getTitle());
    }

    // Delete by list feature//

    @Given("A list of {int} IDs")
    public void aListOfIDs(int ticketsToDelete) {
        IDs = new ArrayList<Integer>();

        this.ticketsToDelete = ticketsToDelete;

        for(int i = 0; i < ticketsToDelete; i++){
            IDs.add(i);
        }
    }

    @When("I want to delete those records from the database")
    public void iWantToDeleteTicketsToDeleteRecordsFromThe() throws Exception {
        dataBase.deleteByList(IDs);
    }

    @Then("The size of the database should be {int}")
    public void theSizeShouldBeFewerByTheTicketsToDelete(int size) {
        assertEquals(10-ticketsToDelete, size);
    }
}
