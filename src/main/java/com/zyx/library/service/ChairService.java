package com.zyx.library.service;

import com.zyx.library.entity.Chair;

import java.util.List;

/**
 * 占座service
 */
public interface ChairService {

    /**
     * 获取所有座位
     * @return
     */
    List<Chair> chair();

    /**
     * 预约某个座位
     * @param id
     */
    void reservationChairById(int id);

    /**
     * 签到，使用座位，预约完成
     * @param reservationId
     */
    void signChairById(int reservationId);

    /**
     * 座位释放
     * @param id
     */
    void cleanChairById(int id);
}
