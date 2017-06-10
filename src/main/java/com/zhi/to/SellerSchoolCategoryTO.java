package com.zhi.to;

/**
 * Created by lebron374 on 2017/6/7.
 */
public class SellerSchoolCategoryTO {
    private Long id;
    private String categoryName;
    private Long categoryOrder;
    private Long categoryFlag;
    private Long gmtCreate;
    private Long gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(Long categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public Long getCategoryFlag() {
        return categoryFlag;
    }

    public void setCategoryFlag(Long categoryFlag) {
        this.categoryFlag = categoryFlag;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Long gmtModify) {
        this.gmtModify = gmtModify;
    }
}
