package com.zyx.library.service.impl;

import com.zyx.library.dao.BookMapper;
import com.zyx.library.entity.*;
import com.zyx.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService {
    @Autowired(required = false)
    BookMapper bookMapper;

    @Override
    public List<ReservationDetail> getReservationList(User user) {
        return bookMapper.getReservationList(user);
    }

    @Override
    public List<BookList> getList() {
        return bookMapper.getList();
    }

    @Override
    public List<BorrowDetail> getBorrowInfo(User user) {
        return bookMapper.getBorrowInfo(user);
    }

    @Override
    public void returnBookById(Integer borrowId) {
        bookMapper.returnBookById(borrowId);
    }

    @Override
    public void reservation(String ISBN, User user) {
        bookMapper.reservation(ISBN,user);
    }

    @Override
    public int surplus() {
        return bookMapper.surplus();
    }

    @Override
    public int bookedBooks(User user) {
        return bookMapper.bookedBooks(user);
    }

    @Override
    public int unReturnedBooks(User user) {
        return bookMapper.unReturnedBooks(user);
    }

    @Override
    public List<BorrowDetail> recentBorrow(User user) {
        return bookMapper.recentBorrow(user);
    }


}
