package com.example.demo.mapper;

import com.example.demo.entity.User;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

/**
 * Created by asus on 2020/7/16.
 */
public interface UserMapper extends Mapper<User>{
    List<User> findAll();
}
