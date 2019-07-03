package com.zyx.library.controller;

import com.zyx.library.entity.BookList;
import com.zyx.library.entity.BorrowDetail;
import com.zyx.library.entity.User;
import com.zyx.library.service.AdminService;
import com.zyx.library.service.BookService;
import com.zyx.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/managebooks")
public class LoginController {
    @Autowired
    UserService userService;

    @Autowired
    BookService bookService;

    @Autowired
    AdminService adminService;

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/detail")
    public String detail(Model model,
                         HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user;
        if (userName == null) return "login";
        if (userName.contains("admin_")) {
            user = new User(userName, password);
            User u = userService.checkManager(user);
            if (u == null) return "login";
            model.addAttribute("user", u);
            request.getSession().setAttribute("user", u);
            List<BookList> list = adminService.getAdminList();
            model.addAttribute("list",list);
            return "admin_page";
        } else {
            user = new User(userName, password);
            User u = userService.checkUser(user);
            if (u == null) return "login";
            int surplus = bookService.surplus();
            int bookedBooks = bookService.bookedBooks(u);
            int unReturnedBooks = bookService.unReturnedBooks(u);
            List<BorrowDetail> recentBorrow = bookService.recentBorrow(u);
            model.addAttribute("surplus",surplus);
            model.addAttribute("user", u);
            model.addAttribute("bookedBooks",bookedBooks);
            model.addAttribute("unReturnedBooks", unReturnedBooks);
            model.addAttribute("recentBorrow",recentBorrow);
            request.getSession().setAttribute("user", u);
            return "user_page";
        }
    }

    @GetMapping(value = "/user_page")
    public String homepage(Model model,
                           HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        int surplus = bookService.surplus();
        int bookedBooks = bookService.bookedBooks(user);
        int unReturnedBooks = bookService.unReturnedBooks(user);
        List<BorrowDetail> recentBorrow = bookService.recentBorrow(user);
        model.addAttribute("surplus",surplus);
        model.addAttribute("bookedBooks",bookedBooks);
        model.addAttribute("unReturnedBooks", unReturnedBooks);
        model.addAttribute("recentBorrow",recentBorrow);
        return "user_page";
    }

    @GetMapping(value = "/admin_page")
    public String adminhomepage(Model model,
                                HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        List<BookList> list = adminService.getAdminList();
        model.addAttribute("list",list);
        return "admin_page";
    }
}
