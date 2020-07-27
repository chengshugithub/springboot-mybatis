package com.example.demo.service.impl;/**
 * Created by asus on 2020/7/16.
 */

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: cs
 * @create: 2020-07-16 11:43
 **/
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo findAll(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage,2);
        List<User> userList=userMapper.findAll();
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        return pageInfo;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int save(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deletUserById(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updataUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }


}
