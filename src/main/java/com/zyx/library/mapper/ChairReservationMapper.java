package com.zyx.library.mapper;

import com.zyx.library.pojo.ChairReservation;
import com.zyx.library.pojo.ChairReservationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChairReservationMapper {
    int countByExample(ChairReservationExample example);

    int deleteByExample(ChairReservationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChairReservation record);

    int insertSelective(ChairReservation record);

    List<ChairReservation> selectByExample(ChairReservationExample example);

    ChairReservation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChairReservation record, @Param("example") ChairReservationExample example);

    int updateByExample(@Param("record") ChairReservation record, @Param("example") ChairReservationExample example);

    int updateByPrimaryKeySelective(ChairReservation record);

    int updateByPrimaryKey(ChairReservation record);
}