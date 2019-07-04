package com.zyx.library.mapper;

import com.zyx.library.pojo.BookReservation;
import com.zyx.library.pojo.BookReservationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookReservationMapper {
    int countByExample(BookReservationExample example);

    int deleteByExample(BookReservationExample example);

    int deleteByPrimaryKey(Integer reservationId);

    int insert(BookReservation record);

    int insertSelective(BookReservation record);

    List<BookReservation> selectByExample(BookReservationExample example);

    BookReservation selectByPrimaryKey(Integer reservationId);

    int updateByExampleSelective(@Param("record") BookReservation record, @Param("example") BookReservationExample example);

    int updateByExample(@Param("record") BookReservation record, @Param("example") BookReservationExample example);

    int updateByPrimaryKeySelective(BookReservation record);

    int updateByPrimaryKey(BookReservation record);
}