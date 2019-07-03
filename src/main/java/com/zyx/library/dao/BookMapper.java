package com.zyx.library.dao;

import com.zyx.library.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    List<BookList> getList();

    // 用户还书
    void returnBookById(@Param("borrowId") Integer borrowId);

    void reservation(@Param("ISBN")String ISBN,@Param("user") User user);

    List<ReservationDetail> getReservationList(@Param("user") User user);

    List<BorrowDetail> getBorrowInfo(@Param("user")User user);

    int surplus();

    int bookedBooks(@Param("user")User user);

    int unReturnedBooks(@Param("user")User user);

    List<BorrowDetail> recentBorrow(@Param("user")User user);
}
