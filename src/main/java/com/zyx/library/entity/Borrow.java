package com.zyx.library.entity;

import java.io.Serializable;
import java.util.Date;

public class Borrow implements Serializable {
    private int borrowId;
    private int bookId;
    private int userId;
    private Date btime;
    private Date deadline;
    private Date rtime;
    private int operator;

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "borrowId=" + borrowId +
                ", bookId=" + bookId +
                ", userId=" + userId +
                ", btime=" + btime +
                ", deadline=" + deadline +
                ", rtime=" + rtime +
                ", operator=" + operator +
                '}';
    }
}
