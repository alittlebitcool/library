package com.zyx.library.service.impl;

import com.zyx.library.dao.ChairMapper;
import com.zyx.library.entity.Chair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChairServiceImplTest {

    @Autowired
    ChairMapper chairMapper;

    @Test
    public void test() {
        for (int i = 1; i <= 100; i++) {
            Chair chair = new Chair();
            chair.setChairId(i);
            chair.setState(0);
            chairMapper.insertSelective(chair);
        }
    }

}