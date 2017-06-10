package com.zhi.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by lebron374 on 2017/6/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/unittest/unit-test.xml")
public class RedisClusterUtilTest {

    @Resource
    private RedisClusterUtil redisClusterUtil;

    @Test
    public void testGet() throws Exception {
        redisClusterUtil.get("123");
    }
}