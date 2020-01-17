package pl.edu.pjatk.tau.serviceDeskApp.labone.data;

import pl.edu.pjatk.tau.serviceDeskApp.labone.domain.Ticket;
import pl.edu.pjatk.tau.serviceDeskApp.labone.service.CRUDable;

public class DataBase implements CRUDable {

    private Ticket[] data;

    public DataBase(Ticket[] array){
        this.data = array;
    }


    public Ticket create(int id, String title, String desc, String caller) throws Exception {

        data[data.length] = new Ticket(id, title, desc, caller);

        return null;
    }

    public Ticket[] readAll() {
        return data;
    }

    public Ticket read(int id) throws Exception {
        return null;
    }

    public void update(int id, String title, String desc, String caller) throws Exception {

    }

    public void delete() {

    }
}
