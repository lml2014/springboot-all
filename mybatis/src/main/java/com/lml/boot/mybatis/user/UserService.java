package com.lml.boot.mybatis.user;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getUser(Long id) {
        return userMapper.getUserById(id);
    }
}
