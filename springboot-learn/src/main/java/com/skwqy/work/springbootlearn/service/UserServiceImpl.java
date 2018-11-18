package com.skwqy.work.springbootlearn.service;

import com.skwqy.work.springbootlearn.dao.UserMapper;
import com.skwqy.work.springbootlearn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by toutou on 2018/9/15.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(int age){
        return userMapper.getUser(age);
    }
}