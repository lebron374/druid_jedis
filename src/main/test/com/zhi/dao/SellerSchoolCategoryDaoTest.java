package com.zhi.dao;

import com.zhi.model.SellerSchoolCategoryDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by lebron374 on 2017/6/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/unittest/unit-test.xml")
public class SellerSchoolCategoryDaoTest {

    @Resource
    private SellerSchoolCategoryDao sellerSchoolCategoryDao;

    @Test
    public void testGetById() throws Exception {
        SellerSchoolCategoryDO categoryDO = sellerSchoolCategoryDao.getById(1L);
        Assert.assertEquals(1, categoryDO.getId().intValue());
    }
}