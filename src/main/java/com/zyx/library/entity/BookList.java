package com.zyx.library.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BookList implements Serializable {
    private String isbn;
    private String bname;
    private String publisher;
    private String writer;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date ptime;
    private int number;
    private int operator;

    public BookList() {
    }

    public BookList(String isbn, String bname, String publisher, String writer, Date ptime, int number) {
        this.isbn = isbn;
        this.bname = bname;
        this.publisher = publisher;
        this.writer = writer;
        this.ptime = ptime;
        this.number = number;
    }

    public BookList(String isbn, String bname, String publisher, String writer, Date ptime, int number, int operator) {
        this.isbn = isbn;
        this.bname = bname;
        this.publisher = publisher;
        this.writer = writer;
        this.ptime = ptime;
        this.number = number;
        this.operator = operator;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }


    @Override
    public String toString() {
        return "BookList{" +
                "isbn='" + isbn + '\'' +
                ", bname='" + bname + '\'' +
                ", publisher='" + publisher + '\'' +
                ", writer='" + writer + '\'' +
                ", ptime=" + ptime +
                ", number=" + number +
                ", operator=" + operator +
                '}';
    }
}
