package com.zyx.library.controller;

import com.zyx.library.entity.BorrowDetail;
import com.zyx.library.entity.User;
import com.zyx.library.pojo.Chair;
import com.zyx.library.service.AdminService;
import com.zyx.library.service.ChairService;
import com.zyx.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author YuXingZh
 * @Date ：Created in 9:26 2019/7/4
 * @Description：chair disposal program
 */
@Controller
@RequestMapping("/chair")
public class ChairController {

    @Autowired
    ChairService chairService;

    @Autowired
    AdminService adminService;

    /**
     * 获取所有座位
     * @return
     */
    @GetMapping(value = "/getChairs")
    public String chairs(Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        List<BorrowDetail> list = adminService.showBorrowList();
        model.addAttribute("list", list);
        chairService.chairs();
        return "admin_seatSelect";
    }

    /**
     * 预约某个座位
     * @param id
     */
    void reservationChairById(int id){

    }

    /**
     * 签到，使用座位，预约完成
     * @param reservationId
     */
    void signChairById(int reservationId){

    }

    /**
     * 座位释放
     * @param id
     */
    void cleanChairById(int id){

    }
}
