package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_comment")
public class OrderComment {
    /**
     * 订单评论ID
     */
    @Id
    @Column(name = "order_comment_id")
    private Integer orderCommentId;

    /**
     * 商城订单ID
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 评论内容
     */
    private String comment;

    /**
     * 评价等级
     */
    @Column(name = "rate_grade")
    private Integer rateGrade;

    /**
     * 创建时间
     */
    @Column(name = "create_datetime")
    private Date createDatetime;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 获取订单评论ID
     *
     * @return order_comment_id - 订单评论ID
     */
    public Integer getOrderCommentId() {
        return orderCommentId;
    }

    /**
     * 设置订单评论ID
     *
     * @param orderCommentId 订单评论ID
     */
    public void setOrderCommentId(Integer orderCommentId) {
        this.orderCommentId = orderCommentId;
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
     * 获取评论内容
     *
     * @return comment - 评论内容
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置评论内容
     *
     * @param comment 评论内容
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取评价等级
     *
     * @return rate_grade - 评价等级
     */
    public Integer getRateGrade() {
        return rateGrade;
    }

    /**
     * 设置评价等级
     *
     * @param rateGrade 评价等级
     */
    public void setRateGrade(Integer rateGrade) {
        this.rateGrade = rateGrade;
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
     * 获取会员ID
     *
     * @return member_id - 会员ID
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置会员ID
     *
     * @param memberId 会员ID
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}