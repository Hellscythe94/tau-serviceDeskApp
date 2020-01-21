package pl.edu.pjatk.tau.serviceDeskApp.labone.data;

import pl.edu.pjatk.tau.serviceDeskApp.labone.model.Ticket;
import pl.edu.pjatk.tau.serviceDeskApp.labone.service.CRUDable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class DataBase implements CRUDable {

    private ArrayList<Ticket> data;

    public DataBase(Ticket[] arrayTickets){
        this.data = new ArrayList<Ticket>(Arrays.asList(arrayTickets));
    }


    public void create(int id, String title, String desc, String caller) throws Exception {

        data.add(new Ticket(id, title, desc, caller, new Date()));
    }

    public ArrayList<Ticket> readAll() {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).getTicketdate().setReadDate(new Date().getTime());
        }

        return data;
    }

    public Ticket read(int id) throws Exception {
        data.get(id).getTicketdate().setReadDate(new Date().getTime());
        return data.get(id);
    }

    public void update(int id, String title, String desc, String caller) throws Exception {
        data.get(id).getTicketdate().setUpdateDate(new Date().getTime());
        data.set(id,new Ticket(id, title, desc, caller, read(id).getTicketdate().getCreateDate()));
    }

    public void delete(int id) throws Exception {
        data.remove(id);
    }
}
