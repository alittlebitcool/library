package com.zyx.library.controller;

import com.zyx.library.entity.*;
import com.zyx.library.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/managebooks")
public class ReaderController {
    @Autowired
    BookService bookService;

    @GetMapping(value = "/user_booklist")
    public String listBookList(Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        List<BookList> list = bookService.getList();
        model.addAttribute("list", list);
        return "user_booklist";
    }

    @GetMapping(value = "/user_reservation")
    public String listReservationListById(Model model,
                                  HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        List<ReservationDetail> list = bookService.getReservationList(user);
        model.addAttribute("list", list);
        return "user_reservation";
    }

    @GetMapping(value = "/user_borrow")
    public String listBorListById(Model model,
                                  HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        List<BorrowDetail> list = bookService.getBorrowInfo(user);
        model.addAttribute("list", list);
        return "user_borrow";
    }

    @GetMapping(value = "/{borrowId}/return")
    public String returnBookById(
            Model model,
            HttpServletRequest request,
            @PathVariable(value = "borrowId") Integer borrowId) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        bookService.returnBookById(borrowId);
        List<BorrowDetail> list = bookService.getBorrowInfo(user);
        model.addAttribute("list", list);
        return "user_borrow";
    }

    @GetMapping(value = "{ISBN}/reservation")
    public String reservationByISBN(
            Model model,
            HttpServletRequest request,
            @PathVariable(value = "ISBN") String ISBN,
            HttpServletResponse response) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        try {
            bookService.reservation(ISBN, user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<BookList> list = bookService.getList();
        model.addAttribute("list", list);
        return "user_booklist";
    }



}
