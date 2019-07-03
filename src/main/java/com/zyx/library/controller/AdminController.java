package com.zyx.library.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zyx.library.entity.BookList;
import com.zyx.library.entity.BorrowDetail;
import com.zyx.library.entity.ReservationDetail;
import com.zyx.library.entity.User;
import com.zyx.library.service.AdminService;
import com.zyx.library.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ Author     ：zyx.
 * @ Date       ：Created in 14:49 2018/11/26
 * @ Description：
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private RedisService redisService;

    @Autowired
    AdminService adminService;

    @GetMapping(value = "/admin_add")
    public String showBook(Model model,
                           HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "admin_addbook";
    }

    @RequestMapping(value = "/add1",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    public String addBook(BookList bookList,
                          Model model,
                          HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        List<ReservationDetail> list = adminService.showReservation();
        model.addAttribute("list", list);
        adminService.addBook(bookList);
        return "admin_manage";
    }

    // nothing
    @GetMapping(value = "/admin_manage")
    public String showReservation(Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        List<ReservationDetail> list = adminService.showReservation();
        model.addAttribute("list", list);
        return "admin_manage";
    }

    @GetMapping(value = "/{reservationId}/manage")
    public String manage(
            Model model,
            HttpServletRequest request,
            @PathVariable(value = "reservationId") Integer reservationId) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        adminService.manage(reservationId);
        redisService.remove("showReservation");
        List<ReservationDetail> list = adminService.showReservation();
        model.addAttribute("list", list);
        return "admin_manage";
    }

    @GetMapping(value = "/admin_situation")
    public String showBorrowList(Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        List<BorrowDetail> list = adminService.showBorrowList();
        model.addAttribute("list", list);
        return "admin_situation";
    }
}
