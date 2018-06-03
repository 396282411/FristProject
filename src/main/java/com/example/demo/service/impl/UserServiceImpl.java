package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Transactional
    public List<?> getUserById(String id) {
        List<?> list = userMapper.getUser(id);
        return list;
    }
}
