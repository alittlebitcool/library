package com.zyx.library.entity;

import java.io.Serializable;
import java.util.Date;

public class ReservationDetail implements Serializable {
    private int reservationId;
    private String bname;
    private int bookId;
    private Date deadline;
    private String userName;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "ReservationDetail{" +
                "reservationId=" + reservationId +
                ", bname='" + bname + '\'' +
                ", bookId=" + bookId +
                ", deadline=" + deadline +
                ", userName='" + userName + '\'' +
                '}';
    }
}
