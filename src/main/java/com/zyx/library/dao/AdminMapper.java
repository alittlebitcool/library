package com.zyx.library.dao;

import com.zyx.library.entity.BookList;
import com.zyx.library.entity.BorrowDetail;
import com.zyx.library.entity.ReservationDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    List<BookList> getAdminList();

    void addBook(@Param("bookList") BookList bookList);

    List<ReservationDetail> showReservation();

    void manage(@Param("reservationId")Integer reservationId);

    List<BorrowDetail> showBorrowList();
}
