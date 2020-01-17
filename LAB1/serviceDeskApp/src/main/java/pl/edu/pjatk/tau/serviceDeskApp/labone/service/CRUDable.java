package pl.edu.pjatk.tau.serviceDeskApp.labone.service;

import pl.edu.pjatk.tau.serviceDeskApp.labone.domain.Ticket;

public interface CRUDable {


    public Ticket create(int id, String Title, String desc, String caller) throws Exception;

    public Ticket[] readAll();

    public Ticket read(int id) throws Exception;

    public void update(int id, String Title, String desc, String caller) throws Exception;

    public void delete();
}
