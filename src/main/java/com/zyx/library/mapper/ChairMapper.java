package com.zyx.library.mapper;

import com.zyx.library.pojo.Chair;
import com.zyx.library.pojo.ChairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChairMapper {
    int countByExample(ChairExample example);

    int deleteByExample(ChairExample example);

    int deleteByPrimaryKey(Integer chairId);

    int insert(Chair record);

    int insertSelective(Chair record);

    List<Chair> selectByExample(ChairExample example);

    Chair selectByPrimaryKey(Integer chairId);

    int updateByExampleSelective(@Param("record") Chair record, @Param("example") ChairExample example);

    int updateByExample(@Param("record") Chair record, @Param("example") ChairExample example);

    int updateByPrimaryKeySelective(Chair record);

    int updateByPrimaryKey(Chair record);
}