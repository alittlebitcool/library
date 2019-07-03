package com.zyx.library.dao;

import com.zyx.library.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //通过username和passwd 验证用户 reader
    User checkUser(@Param("user") User user);
    User checkManager(@Param("user") User user);
}
