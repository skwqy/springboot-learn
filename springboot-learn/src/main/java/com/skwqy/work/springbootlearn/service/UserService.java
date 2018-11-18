package com.skwqy.work.springbootlearn.service;

import com.skwqy.work.springbootlearn.model.User;

import java.util.List;

/**
 * Created by toutou on 2018/9/15.
 */
public interface UserService {
    List<User> getUser(int age);
}