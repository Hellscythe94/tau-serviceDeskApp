package pl.edu.pjatk.tau.serviceDeskApp.JBehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pl.edu.pjatk.tau.serviceDeskApp.labone.data.DataBase;
import pl.edu.pjatk.tau.serviceDeskApp.labone.model.Ticket;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

public class JBehaveSteps {

    private DataBase dataBase = new DataBase(new Ticket[]{});
    private Ticket searchedTicketByTitle;
    private ArrayList<Integer> IDs;
    private int ticketsToDelete;

    @Given("A database with $amount tickets")
    public void aDatabaseWithTickets(int amount){
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

        assertEquals(amount, dataBase.readAll().size());
    }

    @When("I want to search for tickets with $phrase in the title")
    public void iWantToSearchForTicketsWithInTheTitle(String phrase){
        searchedTicketByTitle = dataBase.findTicketByTitle(phrase);
    }

    @Then("I should get the Expected ticket with that regex match in the title")
    public void iShouldGetTheExpectedTicketWithThatInTheTitle() throws Exception{
        assertEquals(searchedTicketByTitle.getTitle(), dataBase.read(8).getTitle());
    }

    @Given("A list of $ticketsToDelete IDs")
    public void aListOfIDs(int ticketsToDelete) {
        IDs = new ArrayList<>();

        this.ticketsToDelete = ticketsToDelete;

        for(int i = 0; i < ticketsToDelete; i++){
            IDs.add(i);
        }
    }

    @When("I want to delete those records from the database")
    public void iWantToDeleteTicketsToDeleteRecordsFromThe() throws Exception {
        dataBase.deleteByList(IDs);
    }

    @Then("The size of the database should be $size")
    public void theSizeShouldBeFewerByTheTicketsToDelete(int size) {
        assertEquals(10-ticketsToDelete, size);
    }
}

