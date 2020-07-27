package com.example.demo.controller;/**
 * Created by asus on 2020/7/16.
 */

import com.example.demo.ResultUtil.ResultUtil;
import com.example.demo.config.Result;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: cs
 * @create: 2020-07-16 11:46
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String firsttest() {
        return "firestTest";
    }

    @GetMapping("/users")
    public Result getAll() {
       List<User> userList=userService.findAll();
        return ResultUtil.success(userList);
    }
    //分页
    @RequestMapping("/getAllPage")
    public Result getAllPage(Integer currentPage,Integer pageSize) {
        Map  map=new HashMap();
        PageInfo userList=userService.findAll(currentPage,pageSize);
        map.put("userList",userList.getList());
        map.put("total",userList.getTotal());
        map.put("pages",userList.getPages());
        return ResultUtil.success(map);
    }
    @PostMapping("/users")
    public Result addUser(User user) {
        userService.save(user);
        return ResultUtil.success();
    }
    @PutMapping("/users")
    public Result updataUser(User user) {
        userService.updataUser(user);
        return ResultUtil.success();
    }
    @DeleteMapping("/users/{id}")
    public Result deletUser(@PathVariable("id") int id) {
        userService.deletUserById(id);
        return ResultUtil.success();
    }
}
