package com.zyx.library.service;

import com.zyx.library.entity.BookList;
import com.zyx.library.entity.BorrowDetail;
import com.zyx.library.entity.ReservationDetail;
import com.zyx.library.entity.User;
import org.hibernate.validator.constraints.ISBN;

import java.util.List;

public interface BookService {
    //
    List<ReservationDetail> getReservationList(User user);

    //预约列表
    List<BookList> getList();

    //借阅记录
    List<BorrowDetail> getBorrowInfo(User user);

    //还书
    void returnBookById(Integer borrowId);

    //进行预约
    void reservation(String ISBN,User user);

    //图书总量
    int surplus();

    int bookedBooks(User user);

    int unReturnedBooks(User user);

    List<BorrowDetail> recentBorrow(User u);
}
