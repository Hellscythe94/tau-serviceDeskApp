package pl.edu.pjatk.tau.serviceDeskApp.labone.model;

import java.util.Date;

public class TicketDate {

    private Date createDate;
    private Date updateDate;
    private Date readDate;

    public TicketDate() {
    }

    //-------- getters and setters -----------


    public void setCreateDate(long createDate) {
        this.createDate = new Date(createDate);
    }

    public void setUpdateDate(long updateDate) {
        this.updateDate = new Date(updateDate);
    }

    public void setReadDate(long readDate) {
        this.readDate = new Date(readDate);
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public Date getReadDate() {
        return readDate;
    }
}
