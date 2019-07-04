package com.zyx.library.mapper;

import com.zyx.library.pojo.BoxReservation;
import com.zyx.library.pojo.BoxReservationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoxReservationMapper {
    int countByExample(BoxReservationExample example);

    int deleteByExample(BoxReservationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoxReservation record);

    int insertSelective(BoxReservation record);

    List<BoxReservation> selectByExample(BoxReservationExample example);

    BoxReservation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoxReservation record, @Param("example") BoxReservationExample example);

    int updateByExample(@Param("record") BoxReservation record, @Param("example") BoxReservationExample example);

    int updateByPrimaryKeySelective(BoxReservation record);

    int updateByPrimaryKey(BoxReservation record);
}