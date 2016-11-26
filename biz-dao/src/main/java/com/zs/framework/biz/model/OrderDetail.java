package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_detail")
public class OrderDetail {
    /**
     * 商城订单详细ID
     */
    @Id
    @Column(name = "order_detail_id")
    private Integer orderDetailId;

    /**
     * 商城订单ID
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品所需积分
     */
    @Column(name = "product_bonus")
    private Integer productBonus;

    /**
     * 兑换数量
     */
    @Column(name = "change_count")
    private Integer changeCount;

    /**
     * 积分合计
     */
    @Column(name = "sum_bonus")
    private Integer sumBonus;

    /**
     * 评价标识
     */
    @Column(name = "comment_flag")
    private Integer commentFlag;

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
     * 获取商城订单详细ID
     *
     * @return order_detail_id - 商城订单详细ID
     */
    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * 设置商城订单详细ID
     *
     * @param orderDetailId 商城订单详细ID
     */
    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * 获取商城订单ID
     *
     * @return order_id - 商城订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置商城订单ID
     *
     * @param orderId 商城订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品所需积分
     *
     * @return product_bonus - 商品所需积分
     */
    public Integer getProductBonus() {
        return productBonus;
    }

    /**
     * 设置商品所需积分
     *
     * @param productBonus 商品所需积分
     */
    public void setProductBonus(Integer productBonus) {
        this.productBonus = productBonus;
    }

    /**
     * 获取兑换数量
     *
     * @return change_count - 兑换数量
     */
    public Integer getChangeCount() {
        return changeCount;
    }

    /**
     * 设置兑换数量
     *
     * @param changeCount 兑换数量
     */
    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    /**
     * 获取积分合计
     *
     * @return sum_bonus - 积分合计
     */
    public Integer getSumBonus() {
        return sumBonus;
    }

    /**
     * 设置积分合计
     *
     * @param sumBonus 积分合计
     */
    public void setSumBonus(Integer sumBonus) {
        this.sumBonus = sumBonus;
    }

    /**
     * 获取评价标识
     *
     * @return comment_flag - 评价标识
     */
    public Integer getCommentFlag() {
        return commentFlag;
    }

    /**
     * 设置评价标识
     *
     * @param commentFlag 评价标识
     */
    public void setCommentFlag(Integer commentFlag) {
        this.commentFlag = commentFlag;
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
}