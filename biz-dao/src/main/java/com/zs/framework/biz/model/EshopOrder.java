package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "eshop_order")
public class EshopOrder {
    /**
     * 商城订单ID
     */
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 配送方式
     */
    @Column(name = "delivery_type")
    private Integer deliveryType;

    /**
     * 提货气站ID
     */
    @Column(name = "station_id")
    private Integer stationId;

    /**
     * 提货码
     */
    @Column(name = "pickself_no")
    private String pickselfNo;

    /**
     * 预计提货日期
     */
    @Column(name = "pickup_time")
    private Date pickupTime;

    /**
     * 邮寄地址
     */
    @Column(name = "mail_address")
    private String mailAddress;

    /**
     * 邮编
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 订单状态
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 是否可见
     */
    @Column(name = "visiable_flag")
    private Integer visiableFlag;

    /**
     * 快递公司
     */
    @Column(name = "delivery_corp")
    private Integer deliveryCorp;

    /**
     * 快递单号
     */
    @Column(name = "delivery_no")
    private String deliveryNo;

    /**
     * 自动确认收货时间倒计时
     */
    @Column(name = "auto_time")
    private String autoTime;

    /**
     * 收货确认时间/提确认时间
     */
    @Column(name = "receive_time")
    private Date receiveTime;

    /**
     * 收货人
     */
    private String receiver;

    /**
     * 联系方式
     */
    @Column(name = "pick_phone")
    private String pickPhone;

    /**
     * 总积分
     */
    @Column(name = "total_bonus")
    private Integer totalBonus;

    /**
     * 消费者备注
     */
    @Column(name = "member_comment")
    private String memberComment;

    /**
     * 平台备注
     */
    @Column(name = "platform_comment")
    private String platformComment;

    /**
     * 发货者ID
     */
    @Column(name = "sender_id")
    private Integer senderId;

    /**
     * 发货时间
     */
    @Column(name = "deliver_time")
    private Date deliverTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间(下单时间)
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

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
     * 获取订单编号
     *
     * @return order_no - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取配送方式
     *
     * @return delivery_type - 配送方式
     */
    public Integer getDeliveryType() {
        return deliveryType;
    }

    /**
     * 设置配送方式
     *
     * @param deliveryType 配送方式
     */
    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * 获取提货气站ID
     *
     * @return station_id - 提货气站ID
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 设置提货气站ID
     *
     * @param stationId 提货气站ID
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * 获取提货码
     *
     * @return pickself_no - 提货码
     */
    public String getPickselfNo() {
        return pickselfNo;
    }

    /**
     * 设置提货码
     *
     * @param pickselfNo 提货码
     */
    public void setPickselfNo(String pickselfNo) {
        this.pickselfNo = pickselfNo;
    }

    /**
     * 获取预计提货日期
     *
     * @return pickup_time - 预计提货日期
     */
    public Date getPickupTime() {
        return pickupTime;
    }

    /**
     * 设置预计提货日期
     *
     * @param pickupTime 预计提货日期
     */
    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    /**
     * 获取邮寄地址
     *
     * @return mail_address - 邮寄地址
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * 设置邮寄地址
     *
     * @param mailAddress 邮寄地址
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /**
     * 获取邮编
     *
     * @return zip_code - 邮编
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置邮编
     *
     * @param zipCode 邮编
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取是否可见
     *
     * @return visiable_flag - 是否可见
     */
    public Integer getVisiableFlag() {
        return visiableFlag;
    }

    /**
     * 设置是否可见
     *
     * @param visiableFlag 是否可见
     */
    public void setVisiableFlag(Integer visiableFlag) {
        this.visiableFlag = visiableFlag;
    }

    /**
     * 获取快递公司
     *
     * @return delivery_corp - 快递公司
     */
    public Integer getDeliveryCorp() {
        return deliveryCorp;
    }

    /**
     * 设置快递公司
     *
     * @param deliveryCorp 快递公司
     */
    public void setDeliveryCorp(Integer deliveryCorp) {
        this.deliveryCorp = deliveryCorp;
    }

    /**
     * 获取快递单号
     *
     * @return delivery_no - 快递单号
     */
    public String getDeliveryNo() {
        return deliveryNo;
    }

    /**
     * 设置快递单号
     *
     * @param deliveryNo 快递单号
     */
    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    /**
     * 获取自动确认收货时间倒计时
     *
     * @return auto_time - 自动确认收货时间倒计时
     */
    public String getAutoTime() {
        return autoTime;
    }

    /**
     * 设置自动确认收货时间倒计时
     *
     * @param autoTime 自动确认收货时间倒计时
     */
    public void setAutoTime(String autoTime) {
        this.autoTime = autoTime;
    }

    /**
     * 获取收货确认时间/提确认时间
     *
     * @return receive_time - 收货确认时间/提确认时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置收货确认时间/提确认时间
     *
     * @param receiveTime 收货确认时间/提确认时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取收货人
     *
     * @return receiver - 收货人
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置收货人
     *
     * @param receiver 收货人
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * 获取联系方式
     *
     * @return pick_phone - 联系方式
     */
    public String getPickPhone() {
        return pickPhone;
    }

    /**
     * 设置联系方式
     *
     * @param pickPhone 联系方式
     */
    public void setPickPhone(String pickPhone) {
        this.pickPhone = pickPhone;
    }

    /**
     * 获取总积分
     *
     * @return total_bonus - 总积分
     */
    public Integer getTotalBonus() {
        return totalBonus;
    }

    /**
     * 设置总积分
     *
     * @param totalBonus 总积分
     */
    public void setTotalBonus(Integer totalBonus) {
        this.totalBonus = totalBonus;
    }

    /**
     * 获取消费者备注
     *
     * @return member_comment - 消费者备注
     */
    public String getMemberComment() {
        return memberComment;
    }

    /**
     * 设置消费者备注
     *
     * @param memberComment 消费者备注
     */
    public void setMemberComment(String memberComment) {
        this.memberComment = memberComment;
    }

    /**
     * 获取平台备注
     *
     * @return platform_comment - 平台备注
     */
    public String getPlatformComment() {
        return platformComment;
    }

    /**
     * 设置平台备注
     *
     * @param platformComment 平台备注
     */
    public void setPlatformComment(String platformComment) {
        this.platformComment = platformComment;
    }

    /**
     * 获取发货者ID
     *
     * @return sender_id - 发货者ID
     */
    public Integer getSenderId() {
        return senderId;
    }

    /**
     * 设置发货者ID
     *
     * @param senderId 发货者ID
     */
    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    /**
     * 获取发货时间
     *
     * @return deliver_time - 发货时间
     */
    public Date getDeliverTime() {
        return deliverTime;
    }

    /**
     * 设置发货时间
     *
     * @param deliverTime 发货时间
     */
    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
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
     * 获取创建时间(下单时间)
     *
     * @return create_time - 创建时间(下单时间)
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间(下单时间)
     *
     * @param createTime 创建时间(下单时间)
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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