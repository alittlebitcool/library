package com.zyx.library.entity;

import java.io.Serializable;
import java.util.Date;

public class BorrowDetail implements Serializable {
    private int borrowId;
    private String bname;
    private String userName;
    private Date btime;
    private Date deadline;
    private Date rtime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    @Override
    public String toString() {
        return "BorrowDetail{" +
                "borrowId=" + borrowId +
                ", bname='" + bname + '\'' +
                ", userName='" + userName + '\'' +
                ", btime=" + btime +
                ", deadline=" + deadline +
                ", rtime=" + rtime +
                '}';
    }
}
