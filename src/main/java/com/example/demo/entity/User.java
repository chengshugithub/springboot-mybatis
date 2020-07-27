package com.example.demo.entity;/**
 * Created by asus on 2020/7/16.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Repository;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: demo
 * @description:
 * @author: cs
 * @create: 2020-07-16 11:35
 **/
@Repository
@Table(name = "user")//mybatis通用接口mapper依赖JPA实体类采用JPA
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//编号
    @Column(name = "user_name", nullable = false)
    private String userName;//用户名
    private String password;//密码
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}