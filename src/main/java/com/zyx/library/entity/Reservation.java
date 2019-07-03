package com.zyx.library.entity;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {
    private int reservationId;
    private int userId;
    private int bookId;
    private Date deadline;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", deadline=" + deadline +
                '}';
    }
}
