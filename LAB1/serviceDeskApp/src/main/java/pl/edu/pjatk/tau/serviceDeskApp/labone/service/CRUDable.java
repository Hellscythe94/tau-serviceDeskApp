package pl.edu.pjatk.tau.serviceDeskApp.labone.service;

import pl.edu.pjatk.tau.serviceDeskApp.labone.domain.Ticket;

import java.util.ArrayList;

public interface CRUDable {


    public void create(int id, String Title, String desc, String caller) throws Exception;

    public ArrayList<Ticket> readAll();

    public Ticket read(int id) throws Exception;

    public void update(int id, String Title, String desc, String caller) throws Exception;

    public void delete(int id);
}
