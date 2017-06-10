package com.zhi.util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * Created by lebron374 on 2017/6/10.
 */
@Component
public class JedisUtil {
    @Resource
    private Jedis jedis;

    public String set(String key, String value) {
        return  jedis.set(key, value);
    }

    public String get(String key) {
        return  jedis.get(key);
    }
}
