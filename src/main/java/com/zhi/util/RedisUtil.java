package com.zhi.util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import javax.annotation.Resource;

/**
 * Created by lebron374 on 2017/6/8.
 */

@Component
public class RedisUtil {
    @Resource
    private ShardedJedisPool shardedJedisPool;

    private ShardedJedis getRedisClient() {
        ShardedJedis shardJedis = null;

        try {
            shardJedis = shardedJedisPool.getResource();

            return shardJedis;
        } catch (Exception e) {
            if (null != shardJedis) {
                shardJedis.close();
            }

            return null;
        }
    }

    private void returnResource(ShardedJedis shardedJedis) {
        shardedJedis.close();
    }

    public String get(String key) {
        ShardedJedis shardJedis = getRedisClient();
        String value = shardJedis.get(key);

        returnResource(shardJedis);

        return value;
    }

    public String set(String key, String value) {
        ShardedJedis shardJedis = getRedisClient();
        String ret = shardJedis.set(key, value);

        returnResource(shardJedis);

        return ret;
    }

    public Long lpush(String key, String value) {
        ShardedJedis shardJedis = getRedisClient();
        Long ret = shardJedis.lpush(key, value);
        returnResource(shardJedis);

        return ret;
    }

    public String lpop(String key) {
        ShardedJedis shardJedis = getRedisClient();
        String ret = shardJedis.lpop(key);
        returnResource(shardJedis);

        return ret;
    }
}
