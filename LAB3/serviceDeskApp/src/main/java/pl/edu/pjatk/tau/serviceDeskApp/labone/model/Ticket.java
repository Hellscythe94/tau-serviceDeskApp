package pl.edu.pjatk.tau.serviceDeskApp.labone.model;

import java.util.Date;

public class Ticket {

    private int id; // primary

    private String title;
    private String desc;
    private String caller;
    private TicketDate Ticketdate = new TicketDate();




    public Ticket(int id, String title, String desc, String caller, Date creationDate){
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.caller = caller;
        Ticketdate.setCreateDate(creationDate.getTime());
    }

    public Ticket(){ }



    //-------------METHODS--------------

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ticket ticket = (Ticket) o;
        return title.equals(ticket.title) &&
                desc.equals(ticket.desc) &&
                caller.equals(ticket.caller) &&
                id == ticket.id;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public TicketDate getTicketdate() {
        return Ticketdate;
    }

    public void setTicketdate(TicketDate ticketdate) {
        this.Ticketdate = ticketdate;
    }
}
