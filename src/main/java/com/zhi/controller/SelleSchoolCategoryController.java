package com.zhi.controller;

import com.zhi.service.SellerSchoolCategoryBiz;
import com.zhi.to.SellerSchoolCategoryTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lebron374 on 2017/6/8.
 */

@Controller
@RequestMapping("/seller")
public class SelleSchoolCategoryController {
    @Resource
    private SellerSchoolCategoryBiz categoryBiz;

    @ResponseBody
    @RequestMapping("/listCategory")
    public List<SellerSchoolCategoryTO> listSellerSchoolCategory (@RequestParam("categoryId") Long categoryId) {
        return categoryBiz.listSellerSchoolCategory(categoryId);
    }
}
