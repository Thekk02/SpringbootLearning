package com.kk.springadvance.util;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

/**
 * @author kk
 * @description redis相关工具类
 * @date 2025-11-20 14:41:27
 */
public class RedisUtil {
    private static final Charset CODE = StandardCharsets.UTF_8;

    private static final String KEY_PREFIX = "springadvance_";
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

    /**
     * 缓存值序列化处理
     */
    public static <T> byte[] valBytes(T val){
        if(val instanceof String){
            return ((String)val).getBytes(CODE);
        }else{
            return JsonUtil.toStr(val).getBytes(CODE);
        }
    }

    /**
     * 生成缓存KEY
     */
    public static byte[] keyBytes(String key){
        nulCheck(key);
        key = KEY_PREFIX + key;
        return key.getBytes(CODE);
    }
    /**
     * 返回key的有效期
     */
    public static Long ttl(String key){
        return template.execute((RedisCallback<Long>)con -> con.ttl(keyBytes(key)));
    }
    /**
     * 查询缓存
     */
    public static String getStr(String key){
        return template.execute((RedisCallback<String>) conn -> {
            byte[] val = conn.get(keyBytes(key));
            return val == null ? null : new String(val);
        });
    }
    /**
     * 设置缓存
     */
    public static void setStr(String key,String value){
        template.execute((RedisCallback<Void>) conn -> {
            conn.set(keyBytes(key),valBytes(value));
            return null;
        });
    }
    /**
     * 删除缓存
     */
    public static void del(String key){
        template.execute((RedisCallback<Long>) conn -> conn.del(keyBytes(key)));
    }

    /**
     * 设置缓存有效期
     */
    public static void expire(String key,Long expire){
        template.execute((RedisCallback<Void>) conn -> {
            conn.expire(keyBytes(key),expire);
            return null;
        });
    }
    /**
     * 带过期时间的缓存写入
     *
     * @param key
     * @param value
     * @param expire s为单位
     * @return
     */
    public static Boolean setStrWithExpire(String key, String value, Long expire) {
        return template.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return redisConnection.setEx(keyBytes(key), expire, valBytes(value));
            }
        });
    }










}
