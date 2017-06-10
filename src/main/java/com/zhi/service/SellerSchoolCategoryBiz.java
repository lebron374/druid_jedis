package com.zhi.service;

import com.zhi.api.ISellerSchoolCategory;
import com.zhi.dao.SellerSchoolCategoryDao;
import com.zhi.model.SellerSchoolCategoryDO;
import com.zhi.to.SellerSchoolCategoryTO;
import com.zhi.util.CommonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lebron374 on 2017/6/7.
 */

@Service
public class SellerSchoolCategoryBiz implements ISellerSchoolCategory {

    @Resource
    private SellerSchoolCategoryDao sellerSchoolCategoryDao;

    public List<SellerSchoolCategoryTO> listSellerSchoolCategory(Long categoryId) {
        List<SellerSchoolCategoryDO> categoryDOList = new ArrayList<SellerSchoolCategoryDO>();
        SellerSchoolCategoryDO categoryDO = sellerSchoolCategoryDao.getById(categoryId);
        categoryDOList.add(categoryDO);

        List<SellerSchoolCategoryTO> categoryTOList = CommonUtil.copyBeanList(categoryDOList, SellerSchoolCategoryTO.class);

        return categoryTOList;
    }
}
