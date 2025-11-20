package com.kk.springadvance.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author kk
 * @description redis数据操作测试
 * @date 2025-11-20 14:01:20
 */
@SpringBootTest
public class RedisTemplateTest {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void testPutandGet(){
        redisTemplate.opsForValue().set("demo","demo");
        stringRedisTemplate.opsForList().rightPush("man","你好");
        stringRedisTemplate.opsForList().rightPush("man","世界");
        stringRedisTemplate.opsForList().rightPush("man","北京");
        System.out.println(redisTemplate.opsForValue().get("demo"));
        System.out.println(stringRedisTemplate.opsForList().range("man",0,-1));
    }
}
