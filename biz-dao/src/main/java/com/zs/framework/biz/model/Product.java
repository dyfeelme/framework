package com.zs.framework.biz.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Product {
    /**
     * 商品ID
     */
    @Id
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 商品分类ID
     */
    @Column(name = "product_group_id")
    private Integer productGroupId;

    /**
     * 商品编号
     */
    private String no;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 可见标识
     */
    @Column(name = "visible_flag")
    private Integer visibleFlag;

    /**
     * 兑换所需积分
     */
    @Column(name = "exchange_bouns")
    private Integer exchangeBouns;

    /**
     * 市场建议价格
     */
    @Column(name = "suggest_price")
    private BigDecimal suggestPrice;

    /**
     * 商品总兑换数
     */
    @Column(name = "account_of_change")
    private Integer accountOfChange;

    /**
     * 商品库存
     */
    @Column(name = "product_stock")
    private Integer productStock;

    /**
     * 商品评分
     */
    private BigDecimal rate;

    /**
     * 商品评价总数
     */
    @Column(name = "rate_total")
    private Integer rateTotal;

    /**
     * 是否支持自提
     */
    @Column(name = "is_pick_self")
    private Integer isPickSelf;

    /**
     * 备注
     */
    private String comment;

    /**
     * 更新者ID
     */
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_datetime")
    private Date createDatetime;

    /**
     * 记录状态
     */
    private Integer state;

    /**
     * 置顶标识
     */
    @Column(name = "top_flag")
    private Integer topFlag;

    /**
     * 商品介绍
     */
    @Column(name = "product_intro")
    private String productIntro;

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
     * 获取商品分类ID
     *
     * @return product_group_id - 商品分类ID
     */
    public Integer getProductGroupId() {
        return productGroupId;
    }

    /**
     * 设置商品分类ID
     *
     * @param productGroupId 商品分类ID
     */
    public void setProductGroupId(Integer productGroupId) {
        this.productGroupId = productGroupId;
    }

    /**
     * 获取商品编号
     *
     * @return no - 商品编号
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置商品编号
     *
     * @param no 商品编号
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取可见标识
     *
     * @return visible_flag - 可见标识
     */
    public Integer getVisibleFlag() {
        return visibleFlag;
    }

    /**
     * 设置可见标识
     *
     * @param visibleFlag 可见标识
     */
    public void setVisibleFlag(Integer visibleFlag) {
        this.visibleFlag = visibleFlag;
    }

    /**
     * 获取兑换所需积分
     *
     * @return exchange_bouns - 兑换所需积分
     */
    public Integer getExchangeBouns() {
        return exchangeBouns;
    }

    /**
     * 设置兑换所需积分
     *
     * @param exchangeBouns 兑换所需积分
     */
    public void setExchangeBouns(Integer exchangeBouns) {
        this.exchangeBouns = exchangeBouns;
    }

    /**
     * 获取市场建议价格
     *
     * @return suggest_price - 市场建议价格
     */
    public BigDecimal getSuggestPrice() {
        return suggestPrice;
    }

    /**
     * 设置市场建议价格
     *
     * @param suggestPrice 市场建议价格
     */
    public void setSuggestPrice(BigDecimal suggestPrice) {
        this.suggestPrice = suggestPrice;
    }

    /**
     * 获取商品总兑换数
     *
     * @return account_of_change - 商品总兑换数
     */
    public Integer getAccountOfChange() {
        return accountOfChange;
    }

    /**
     * 设置商品总兑换数
     *
     * @param accountOfChange 商品总兑换数
     */
    public void setAccountOfChange(Integer accountOfChange) {
        this.accountOfChange = accountOfChange;
    }

    /**
     * 获取商品库存
     *
     * @return product_stock - 商品库存
     */
    public Integer getProductStock() {
        return productStock;
    }

    /**
     * 设置商品库存
     *
     * @param productStock 商品库存
     */
    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    /**
     * 获取商品评分
     *
     * @return rate - 商品评分
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置商品评分
     *
     * @param rate 商品评分
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取商品评价总数
     *
     * @return rate_total - 商品评价总数
     */
    public Integer getRateTotal() {
        return rateTotal;
    }

    /**
     * 设置商品评价总数
     *
     * @param rateTotal 商品评价总数
     */
    public void setRateTotal(Integer rateTotal) {
        this.rateTotal = rateTotal;
    }

    /**
     * 获取是否支持自提
     *
     * @return is_pick_self - 是否支持自提
     */
    public Integer getIsPickSelf() {
        return isPickSelf;
    }

    /**
     * 设置是否支持自提
     *
     * @param isPickSelf 是否支持自提
     */
    public void setIsPickSelf(Integer isPickSelf) {
        this.isPickSelf = isPickSelf;
    }

    /**
     * 获取备注
     *
     * @return comment - 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取更新者ID
     *
     * @return operator_id - 更新者ID
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 设置更新者ID
     *
     * @param operatorId 更新者ID
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_datetime - 创建时间
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * 设置创建时间
     *
     * @param createDatetime 创建时间
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * 获取记录状态
     *
     * @return state - 记录状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置记录状态
     *
     * @param state 记录状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取置顶标识
     *
     * @return top_flag - 置顶标识
     */
    public Integer getTopFlag() {
        return topFlag;
    }

    /**
     * 设置置顶标识
     *
     * @param topFlag 置顶标识
     */
    public void setTopFlag(Integer topFlag) {
        this.topFlag = topFlag;
    }

    /**
     * 获取商品介绍
     *
     * @return product_intro - 商品介绍
     */
    public String getProductIntro() {
        return productIntro;
    }

    /**
     * 设置商品介绍
     *
     * @param productIntro 商品介绍
     */
    public void setProductIntro(String productIntro) {
        this.productIntro = productIntro;
    }
}