package com.zhi.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by lebron374 on 2017/6/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/unittest/unit-test.xml")
public class RedisUtilTest {

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void testGet() throws Exception {
        String value = redisUtil.get("123");
        Assert.assertEquals("123", value);
    }

    @Test
    public void testSet() throws Exception {
        String value = redisUtil.set("234", "234");
        Assert.assertEquals("OK", value);
    }

    @Test
    public void testLpush() throws Exception {
        Long ret = redisUtil.lpush("list1", "123");
        Assert.assertEquals(1, ret.longValue());
        redisUtil.lpop("list1");
    }

    @Test
    public void testLpop() throws Exception {
        redisUtil.lpush("list1", "123");
        String ret = redisUtil.lpop("list1");
        Assert.assertEquals(ret, "123");
    }
}