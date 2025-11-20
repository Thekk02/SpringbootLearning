package com.kk.springadvance.util;

import org.springframework.data.redis.core.RedisTemplate;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author kk
 * @description redis相关工具类
 * @date 2025-11-20 14:41:27
 */
public class RedisUtil {
    private static final Charset CODE = StandardCharsets.UTF_8;

    private static final String KEY_PREFIX = "kk_";
    public static  RedisTemplate<String,String> template;

    public static void register(RedisTemplate<String,String> template){
        RedisUtil.template = template;
    }


    //检查参数是否为空，如果有空参报错
    public static void nulCheck(Object... args){
        for(Object arg : args){
            if(arg == null){
                throw new IllegalArgumentException("redis argument can not be null!");
            }
        }
    }

















}
