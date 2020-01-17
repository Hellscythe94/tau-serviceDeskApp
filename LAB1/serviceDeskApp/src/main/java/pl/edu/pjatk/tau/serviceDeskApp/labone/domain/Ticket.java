package pl.edu.pjatk.tau.serviceDeskApp.labone.domain;

import java.util.Date;

public class Ticket {

    private int id; // primary

    private String title;
    private String desc;
    private String caller;

    public Ticket(int id, String title, String desc, String caller){
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.caller = caller;
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
}