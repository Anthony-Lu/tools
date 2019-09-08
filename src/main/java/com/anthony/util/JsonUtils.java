package com.anthony.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by Anthony on 2019/9/8 23:09
 */
public class JsonUtils {

    public static <T> String toJsonString(T obj){
        return JSON.toJSONString(obj);
    }

    public static <T> T toObject(String jsonString,Class<T> clazz){
        return JSONObject.parseObject(jsonString,clazz);
    }

    public static <T> List<T> toArray(String jsonString,Class<T> clazz){
        return JSONObject.parseArray(jsonString,clazz);
    }
}
