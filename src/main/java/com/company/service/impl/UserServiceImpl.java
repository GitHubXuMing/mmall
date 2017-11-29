package com.company.service.impl;

import com.company.common.ServerResponse;
import com.company.dao.idao.UserMapper;
import com.company.dao.pojo.User;
import com.company.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Teacher on 2017/11/29.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public ServerResponse<User> login(String username, String password) {
        //1-校验用户名是否存在

        //2-实现用户的登陆校验（MD5加密）
        //TODO： MD5对密码进行加密处理


        return null;
    }
}
