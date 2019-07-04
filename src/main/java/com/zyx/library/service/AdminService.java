package com.zyx.library.service;

import com.zyx.library.entity.BookList;
import com.zyx.library.entity.BorrowDetail;
import com.zyx.library.entity.ReservationDetail;

import java.util.List;

/**
 * @ Author     ：zyx.
 * @ Date       ：Created in 15:06 2018/11/26
 * @ Description：
 */
public interface AdminService {
    void manage(Integer reservationId);

    //获取总图书列表
    List<BookList> getAdminList();

    void addBook(BookList bookList);

    List<ReservationDetail> showReservation();

    List<BorrowDetail> showBorrowList();

    //TODO

}
