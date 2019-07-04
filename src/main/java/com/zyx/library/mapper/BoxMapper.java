package com.zyx.library.mapper;

import com.zyx.library.pojo.Box;
import com.zyx.library.pojo.BoxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoxMapper {
    int countByExample(BoxExample example);

    int deleteByExample(BoxExample example);

    int deleteByPrimaryKey(Integer boxId);

    int insert(Box record);

    int insertSelective(Box record);

    List<Box> selectByExample(BoxExample example);

    Box selectByPrimaryKey(Integer boxId);

    int updateByExampleSelective(@Param("record") Box record, @Param("example") BoxExample example);

    int updateByExample(@Param("record") Box record, @Param("example") BoxExample example);

    int updateByPrimaryKeySelective(Box record);

    int updateByPrimaryKey(Box record);
}