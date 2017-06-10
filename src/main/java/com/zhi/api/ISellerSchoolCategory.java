package com.zhi.api;

import com.zhi.to.SellerSchoolCategoryTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lebron374 on 2017/6/7.
 */

@Service
public interface ISellerSchoolCategory {
    List<SellerSchoolCategoryTO> listSellerSchoolCategory(Long categoryId);
}
