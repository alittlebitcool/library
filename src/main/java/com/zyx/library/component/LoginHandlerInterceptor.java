package com.zyx.library.component;

import com.zyx.library.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ Author     ：zyx.
 * @ Date       ：Created in 21:19 2018/11/18
 * @ Description：自定义拦截器
 */
@Configuration
public class LoginHandlerInterceptor implements HandlerInterceptor {
    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            //未登陆，返回登陆页面
            request.setAttribute("msg", "没有权限请先登陆");
            request.getRequestDispatcher("/login.html").forward(request,
                    response);
            return false;
        } else {
            //已登陆，放行请求
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
