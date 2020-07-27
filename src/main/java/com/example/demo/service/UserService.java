package com.example.demo.service;


import com.example.demo.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by asus on 2020/7/16.
 */
public interface UserService  {
    List<User> findAll();
    int save(User user);
    PageInfo findAll(Integer currentPage, Integer pageSize);
    int deletUserById(int id);
    int updataUser(User user);
}
