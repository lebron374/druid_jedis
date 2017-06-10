package com.zhi.util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;

/**
 * Created by lebron374 on 2017/6/8.
 */

@Component
public class RedisClusterUtil {
    @Resource
    private JedisCluster jedisCluster;

    public String get(String key) {
        return  jedisCluster.get(key);
    }
}
