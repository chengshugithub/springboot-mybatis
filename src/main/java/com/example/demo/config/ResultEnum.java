package com.example.demo.config;/**
 * Created by asus on 2020/7/17.
 */

/**
 * @program: demo
 * @description:
 * @author: cs
 * @create: 2020-07-17 14:26
 **/
public enum ResultEnum {
    //这里是可以自己定义的，方便与前端交互即可
    ERROR(1,"失败"),
    SUCCESS(0,"成功");
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
