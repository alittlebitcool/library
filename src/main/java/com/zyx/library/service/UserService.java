package com.zyx.library.service;


import com.zyx.library.entity.User;
import org.springframework.cache.annotation.Cacheable;

public interface UserService {
    User checkUser(User user);

    @Cacheable(cacheNames = "checkManager")
    User checkManager(User user);
}
