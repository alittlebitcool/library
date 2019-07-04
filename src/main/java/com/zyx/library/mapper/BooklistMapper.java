package com.zyx.library.mapper;

import com.zyx.library.pojo.Booklist;
import com.zyx.library.pojo.BooklistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooklistMapper {
    int countByExample(BooklistExample example);

    int deleteByExample(BooklistExample example);

    int deleteByPrimaryKey(String isbn);

    int insert(Booklist record);

    int insertSelective(Booklist record);

    List<Booklist> selectByExample(BooklistExample example);

    Booklist selectByPrimaryKey(String isbn);

    int updateByExampleSelective(@Param("record") Booklist record, @Param("example") BooklistExample example);

    int updateByExample(@Param("record") Booklist record, @Param("example") BooklistExample example);

    int updateByPrimaryKeySelective(Booklist record);

    int updateByPrimaryKey(Booklist record);
}