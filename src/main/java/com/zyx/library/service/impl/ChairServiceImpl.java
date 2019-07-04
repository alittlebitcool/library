package com.zyx.library.service.impl;

import com.zyx.library.dao.ChairMapper;
import com.zyx.library.pojo.Chair;
import com.zyx.library.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author YuXingZh
 * @Date ：Created in 9:45 2019/7/4
 * @Description：impletation class
 */
public class ChairServiceImpl implements ChairService {

    @Autowired
    ChairMapper chairMapper;

    /**
     * 获取所有座位
     *
     * @return
     */
    @Override
    public List<Chair> chair() {
        return null;
    }

    /**
     * 预约某个座位
     *
     * @param id
     */
    @Override
    public void reservationChairById(int id) {

    }

    /**
     * 签到，使用座位，预约完成
     *
     * @param reservationId
     */
    @Override
    public void signChairById(int reservationId) {

    }

    /**
     * 座位释放
     *
     * @param id
     */
    @Override
    public void cleanChairById(int id) {

    }
}
