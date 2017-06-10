package com.zhi.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by lebron374 on 2017/6/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/unittest/unit-test.xml")
public class JedisUtilTest {

    @Resource
    private JedisUtil jedisUtil;

    @Test
    public void testGet() throws Exception {
        jedisUtil.set("test", "test_value");
        String ret = jedisUtil.get("test");
        Assert.assertEquals(ret, "test_value");
    }
}