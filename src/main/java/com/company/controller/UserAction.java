package com.company.controller;

import com.company.common.ServerResponse;
import com.company.dao.pojo.User;
import com.company.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Teacher on 2017/11/29.
 */
@Controller
@RequestMapping("/user/")
public class UserAction {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session){
        //1- 执行流程 Service-->dao-->sql

        //2-如果登陆成功，将User密码清空，然后放入session中

        //3-设定返回信息

        return null;
    }
}
