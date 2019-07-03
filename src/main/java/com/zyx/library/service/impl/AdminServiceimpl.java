package com.zyx.library.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zyx.library.dao.AdminMapper;
import com.zyx.library.entity.BookList;
import com.zyx.library.entity.BorrowDetail;
import com.zyx.library.entity.ReservationDetail;
import com.zyx.library.service.AdminService;
import com.zyx.library.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author     ：zyx.
 * @ Date       ：Created in 15:06 2018/11/26
 * @ Description：
 */
@Service
public class AdminServiceimpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    private JSONObject json = new JSONObject();

    @Autowired
    private RedisService redisService;


    @Override
    public void manage(Integer reservationId) {
       adminMapper.manage(reservationId);
    }

    @Override
    public List<BookList> getAdminList() {
        String result = redisService.get("getAdminList");
        List<BookList> list = json.parseArray(result, BookList.class);
        if(result == null){
            list = adminMapper.getAdminList();
            redisService.set("getAdminList", json.toJSONString(list));
            return list;
        }else{
            return list;
        }
    }

    @Override
    public void addBook(BookList bookList) {
        adminMapper.addBook(bookList);
    }

    @Override
    public List<ReservationDetail> showReservation() {
        String result = redisService.get("showReservation");
        List<ReservationDetail> list = json.parseArray(result, ReservationDetail.class);
        if(result == null){
            list = adminMapper.showReservation();
            redisService.set("showReservation", json.toJSONString(list));
            return list;
        }else{
            return list;
        }
    }

    @Override
    public List<BorrowDetail> showBorrowList() {
        String result = redisService.get("showBorrowList");
        List<BorrowDetail> list = json.parseArray(result, BorrowDetail.class);
        if(result == null){
            list = adminMapper.showBorrowList();
            redisService.set("showBorrowList", json.toJSONString(list));
            return list;
        }else{
            return list;
        }
    }
}
