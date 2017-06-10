package com.zhi.dao;

import com.zhi.model.SellerSchoolCategoryDO;
import org.springframework.stereotype.Repository;

/**
 * Created by lebron374 on 2017/6/4.
 */

@Repository
public interface SellerSchoolCategoryDao {
    SellerSchoolCategoryDO getById(Long id);
}
