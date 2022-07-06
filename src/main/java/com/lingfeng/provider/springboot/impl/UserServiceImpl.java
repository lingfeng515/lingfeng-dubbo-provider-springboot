package com.lingfeng.provider.springboot.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lingfeng.provider.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserNameById(String userId) {
        String userName = "userId 为\"" + userId + "\"的用户是：张三";
        return userName;
    }
}
