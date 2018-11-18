package com.skwqy.work.springbootlearn.dao;

import com.skwqy.work.springbootlearn.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by toutou on 2018/9/15.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT id,username,age,ctm FROM TB_USER WHERE AGE=#{age}")
    List<User> getUser(int age);
}