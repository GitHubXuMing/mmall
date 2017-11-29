package com.company.service;

import com.company.common.ServerResponse;
import com.company.dao.pojo.User;

/**
 * Created by Teacher on 2017/11/29.
 */
public interface IUserService {
    public ServerResponse<User> login(String username, String password);
}
