package pl.edu.pjatk.tau.serviceDeskApp;

import org.junit.Test;

import org.mockito.Mockito;
import pl.edu.pjatk.tau.serviceDeskApp.labone.data.DataBase;
import pl.edu.pjatk.tau.serviceDeskApp.labone.model.Ticket;
import pl.edu.pjatk.tau.serviceDeskApp.labone.model.TicketDate;

import java.util.Date;

import static org.junit.Assert.*;

public class DataBaseTest {

    @Test
    public void createTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.create(1,"1","11","caller1");
        assertNotNull("Object was not created successfully", dataBase.read(1));
    }


    @Test
    public void readAllTest(){
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                        new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        assertEquals("The length of the array is wrong", 3, dataBase.readAll().size());
    }

    @Test
    public void readTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);


        assertEquals(data[1], dataBase.read(1));
    }

    @Test(expected = Exception.class)
    public void readExceptionTest() throws Exception {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.read(3);
    }

    @Test
    public void updateTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.update(2, "3", "33", "caller3" );
        assertTrue(new Ticket(2, "3", "33", "caller3", new Date()).equals(dataBase.readAll().get(2)));
    }

    @Test(expected = Exception.class)
    public void updateExeptionTest() throws Exception {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.update(6, "3", "33", "caller3" );
    }

    @Test
    public void deleteTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.delete(1);

        assertFalse(new Ticket(1, "1", "11", "caller1", new Date()).equals(dataBase.read(1)));
    }

    @Test(expected = Exception.class)
    public void deleteExceptionTest() throws Exception {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.delete(3);
    }




    //----------LAB2----------------

    @Test
    public void readDateTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.read(1);

        dataBase.read(1).setTicketdate(Mockito.mock(TicketDate.class));

        Mockito.when(dataBase.read(1).getTicketdate().getReadDate()).thenReturn(new Date(1579271517));
        assertEquals(new Date(1579271517),dataBase.read(1).getTicketdate().getReadDate());

        Mockito.verify(dataBase.read(1).getTicketdate()).getReadDate();
    }

    @Test
    public void readAllDateTest() throws Exception {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.readAll();
        for (int i = 0; i < dataBase.readAll().size(); i++) {
            dataBase.read(i).setTicketdate(Mockito.mock(TicketDate.class));
        }

        Mockito.when(dataBase.read(2).getTicketdate().getReadDate()).thenReturn(new Date(1579274149));
        assertEquals(new Date(1579274149), dataBase.read(2).getTicketdate().getReadDate());

        Mockito.verify(dataBase.read(2).getTicketdate()).getReadDate();
    }

    @Test
    public void updateDateTest() throws Exception {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.update(1, "11", "111", "caller11");

        dataBase.read(1).setTicketdate(Mockito.mock(TicketDate.class));

        Mockito.when(dataBase.read(1).getTicketdate().getUpdateDate()).thenReturn(new Date(1579274319));
        assertEquals(new Date(1579274319), dataBase.read(1).getTicketdate().getUpdateDate());

        Mockito.verify(dataBase.read(1).getTicketdate()).getUpdateDate();
    }
    @Test
    public void createDateTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0", new Date()), new Ticket(1, "1", "11", "caller1", new Date()),
                new Ticket(2, "2", "22", "caller2", new Date())};
        DataBase dataBase = new DataBase(data);

        dataBase.create(3, "3", "33", "caller3");
        dataBase.read(3).setTicketdate(Mockito.mock(TicketDate.class));

        Mockito.when(dataBase.read(3).getTicketdate().getCreateDate()).thenReturn(new Date(1579274423));
        assertEquals(new Date(1579274423), dataBase.read(3).getTicketdate().getCreateDate());

        Mockito.verify(dataBase.read(3).getTicketdate()).getCreateDate();
    }

}
