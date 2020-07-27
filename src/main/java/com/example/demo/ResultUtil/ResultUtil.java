package com.example.demo.ResultUtil;/**
 * Created by asus on 2020/7/17.
 */

import com.example.demo.config.Result;
import com.example.demo.config.ResultEnum;

/**
 * @program: demo
 * @description:
 * @author: cs
 * @create: 2020-07-17 14:34
 **/
public class ResultUtil {

    /**成功且带数据**/
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }
    /**成功但不带数据**/
    public static Result success(){

        return success(null);
    }
    /**失败**/
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
