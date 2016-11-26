package com.zs.framework.biz.model;

import javax.persistence.*;

@Table(name = "product_pic")
public class ProductPic {
    /**
     * 商品图片ID
     */
    @Id
    @Column(name = "product_pic_id")
    private Integer productPicId;

    /**
     * 图片URL
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 图片类型
     */
    @Column(name = "pic_type")
    private Integer picType;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 显示顺序号
     */
    @Column(name = "display_index")
    private Integer displayIndex;

    /**
     * 获取商品图片ID
     *
     * @return product_pic_id - 商品图片ID
     */
    public Integer getProductPicId() {
        return productPicId;
    }

    /**
     * 设置商品图片ID
     *
     * @param productPicId 商品图片ID
     */
    public void setProductPicId(Integer productPicId) {
        this.productPicId = productPicId;
    }

    /**
     * 获取图片URL
     *
     * @return pic_url - 图片URL
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置图片URL
     *
     * @param picUrl 图片URL
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取图片类型
     *
     * @return pic_type - 图片类型
     */
    public Integer getPicType() {
        return picType;
    }

    /**
     * 设置图片类型
     *
     * @param picType 图片类型
     */
    public void setPicType(Integer picType) {
        this.picType = picType;
    }

    /**
     * 获取商品ID
     *
     * @return product_id - 商品ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取显示顺序号
     *
     * @return display_index - 显示顺序号
     */
    public Integer getDisplayIndex() {
        return displayIndex;
    }

    /**
     * 设置显示顺序号
     *
     * @param displayIndex 显示顺序号
     */
    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }
}