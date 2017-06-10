package com.zhi.util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.ShardedJedis;

import javax.annotation.Resource;

/**
 * Created by lebron374 on 2017/6/10.
 */
@Component
public class ShardedJedisUtil {
    @Resource
    private ShardedJedis shardedJedis;

    public String set(String key, String value) {
        return shardedJedis.set(key, value);
    }

    public String get(String key) {
        return shardedJedis.get(key);
    }
}
