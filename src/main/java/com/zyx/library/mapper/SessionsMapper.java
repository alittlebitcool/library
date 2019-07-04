package com.zyx.library.mapper;

import com.zyx.library.pojo.Sessions;
import com.zyx.library.pojo.SessionsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SessionsMapper {
    int countByExample(SessionsExample example);

    int deleteByExample(SessionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sessions record);

    int insertSelective(Sessions record);

    List<Sessions> selectByExample(SessionsExample example);

    Sessions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sessions record, @Param("example") SessionsExample example);

    int updateByExample(@Param("record") Sessions record, @Param("example") SessionsExample example);

    int updateByPrimaryKeySelective(Sessions record);

    int updateByPrimaryKey(Sessions record);
}