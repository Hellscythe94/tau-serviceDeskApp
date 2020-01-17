package pl.edu.pjatk.tau.serviceDeskApp;

import org.junit.Test;

import pl.edu.pjatk.tau.serviceDeskApp.labone.data.DataBase;
import pl.edu.pjatk.tau.serviceDeskApp.labone.domain.Ticket;

import static org.junit.Assert.*;

public class DataBaseTest {

    @Test
    public void createTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0")};
        DataBase dataBase = new DataBase(data);

        dataBase.create(1,"1","11","caller1");
        assertNotNull("Object was not created successfully", dataBase.read(1));
    }


    @Test
    public void readAllTest(){
        Ticket[] data = {new Ticket(0, "0", "00", "caller0"), new Ticket(1, "1", "11", "caller1"),
                        new Ticket(2, "2", "22", "caller2")};
        DataBase dataBase = new DataBase(data);

        assertEquals("The length of the array is wrong", 3, dataBase.readAll().size());
    }

    @Test
    public void readTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0"), new Ticket(1, "1", "11", "caller1"),
                new Ticket(2, "2", "22", "caller2")};
        DataBase dataBase = new DataBase(data);


        assertEquals(data[1], dataBase.read(1));
    }

    @Test(expected = Exception.class)
    public void readExceptionTest() throws Exception {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0"), new Ticket(1, "1", "11", "caller1"),
                new Ticket(2, "2", "22", "caller2")};
        DataBase dataBase = new DataBase(data);

        dataBase.read(3);
    }

    @Test
    public void updateTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0"), new Ticket(1, "1", "11", "caller1"),
                new Ticket(2, "2", "22", "caller2")};
        DataBase dataBase = new DataBase(data);

        dataBase.update(2, "3", "33", "caller3" );
        assertTrue(new Ticket(2, "3", "33", "caller3").equals(dataBase.readAll().get(2)));
    }

    @Test(expected = Exception.class)
    public void updateExeptionTest() throws Exception {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0"), new Ticket(1, "1", "11", "caller1"),
                new Ticket(2, "2", "22", "caller2")};
        DataBase dataBase = new DataBase(data);

        dataBase.update(6, "3", "33", "caller3" );
    }

    @Test
    public void deleteTest() throws Exception{
        Ticket[] data = {new Ticket(0, "0", "00", "caller0"), new Ticket(1, "1", "11", "caller1"),
                new Ticket(2, "2", "22", "caller2")};
        DataBase dataBase = new DataBase(data);

        dataBase.delete(1);

        assertFalse(new Ticket(1, "1", "11", "caller1").equals(dataBase.read(1)));
    }

    @Test(expected = Exception.class)
    public void deleteExceptionTest() throws Exception {
        Ticket[] data = {new Ticket(0, "0", "00", "caller0"), new Ticket(1, "1", "11", "caller1"),
                new Ticket(2, "2", "22", "caller2")};
        DataBase dataBase = new DataBase(data);

        dataBase.delete(3);
    }
}
