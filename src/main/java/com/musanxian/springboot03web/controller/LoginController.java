package com.musanxian.springboot03web.controller;

import com.musanxian.springboot03web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password, Model model, HttpSession session){

        //具体业务
        if(!StringUtils.isEmpty(username)&&userService.getUser(username).getPassword().equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            //告诉用户登录失败
            model.addAttribute("msg","用户名或者密码错误！");
            return "index";
        }
    }
}
