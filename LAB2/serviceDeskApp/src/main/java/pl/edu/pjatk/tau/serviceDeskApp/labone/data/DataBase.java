package pl.edu.pjatk.tau.serviceDeskApp.labone.data;

import pl.edu.pjatk.tau.serviceDeskApp.labone.model.Ticket;
import pl.edu.pjatk.tau.serviceDeskApp.labone.service.CRUDable;

import java.util.ArrayList;
import java.util.Arrays;

public class DataBase implements CRUDable {

    private ArrayList<Ticket> data;

    public DataBase(Ticket[] array){
        this.data = new ArrayList<Ticket>(Arrays.asList(array));
    }


    public void create(int id, String title, String desc, String caller) throws Exception {

        data.add(new Ticket(id, title, desc, caller));
    }

    public ArrayList<Ticket> readAll() {
        return data;
    }

    public Ticket read(int id) throws Exception {
        return data.get(id);
    }

    public void update(int id, String title, String desc, String caller) throws Exception {
        data.set(id,new Ticket(id, title, desc, caller));
    }

    public void delete(int id) throws Exception {
        data.remove(id);
    }
}
