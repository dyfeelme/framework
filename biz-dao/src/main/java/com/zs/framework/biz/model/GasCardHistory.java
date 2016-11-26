package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gas_card_history")
public class GasCardHistory {
    /**
     * 一卡通流水ID
     */
    @Id
    @Column(name = "history_id")
    private Integer historyId;

    /**
     * 一卡通类型
     */
    @Column(name = "card_type")
    private String cardType;

    /**
     * 一卡通编码
     */
    @Column(name = "gas_card_no")
    private String gasCardNo;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 手机号
     */
    @Column(name = "mobile_phone")
    private String mobilePhone;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 身份证号
     */
    @Column(name = "id_no")
    private String idNo;

    /**
     * 一卡通账户状态
     */
    @Column(name = "gas_card_status")
    private Integer gasCardStatus;

    /**
     * 是否可充值
     */
    @Column(name = "isCharge")
    private Integer ischarge;

    /**
     * 一卡通父卡编码
     */
    @Column(name = "parent_card_no")
    private String parentCardNo;

    /**
     * 汽车牌照号
     */
    @Column(name = "car_no")
    private String carNo;

    /**
     * 绑定时间
     */
    @Column(name = "binding_time")
    private Date bindingTime;

    /**
     * 解绑时间
     */
    @Column(name = "unbinding_time")
    private Date unbindingTime;

    /**
     * 记录状态
     */
    private Integer state;

    /**
     * 获取一卡通流水ID
     *
     * @return history_id - 一卡通流水ID
     */
    public Integer getHistoryId() {
        return historyId;
    }

    /**
     * 设置一卡通流水ID
     *
     * @param historyId 一卡通流水ID
     */
    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    /**
     * 获取一卡通类型
     *
     * @return card_type - 一卡通类型
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置一卡通类型
     *
     * @param cardType 一卡通类型
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取一卡通编码
     *
     * @return gas_card_no - 一卡通编码
     */
    public String getGasCardNo() {
        return gasCardNo;
    }

    /**
     * 设置一卡通编码
     *
     * @param gasCardNo 一卡通编码
     */
    public void setGasCardNo(String gasCardNo) {
        this.gasCardNo = gasCardNo;
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

    /**
     * 获取手机号
     *
     * @return mobile_phone - 手机号
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置手机号
     *
     * @param mobilePhone 手机号
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取姓名
     *
     * @return user_name - 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     *
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取身份证号
     *
     * @return id_no - 身份证号
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置身份证号
     *
     * @param idNo 身份证号
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * 获取一卡通账户状态
     *
     * @return gas_card_status - 一卡通账户状态
     */
    public Integer getGasCardStatus() {
        return gasCardStatus;
    }

    /**
     * 设置一卡通账户状态
     *
     * @param gasCardStatus 一卡通账户状态
     */
    public void setGasCardStatus(Integer gasCardStatus) {
        this.gasCardStatus = gasCardStatus;
    }

    /**
     * 获取是否可充值
     *
     * @return isCharge - 是否可充值
     */
    public Integer getIscharge() {
        return ischarge;
    }

    /**
     * 设置是否可充值
     *
     * @param ischarge 是否可充值
     */
    public void setIscharge(Integer ischarge) {
        this.ischarge = ischarge;
    }

    /**
     * 获取一卡通父卡编码
     *
     * @return parent_card_no - 一卡通父卡编码
     */
    public String getParentCardNo() {
        return parentCardNo;
    }

    /**
     * 设置一卡通父卡编码
     *
     * @param parentCardNo 一卡通父卡编码
     */
    public void setParentCardNo(String parentCardNo) {
        this.parentCardNo = parentCardNo;
    }

    /**
     * 获取汽车牌照号
     *
     * @return car_no - 汽车牌照号
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 设置汽车牌照号
     *
     * @param carNo 汽车牌照号
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * 获取绑定时间
     *
     * @return binding_time - 绑定时间
     */
    public Date getBindingTime() {
        return bindingTime;
    }

    /**
     * 设置绑定时间
     *
     * @param bindingTime 绑定时间
     */
    public void setBindingTime(Date bindingTime) {
        this.bindingTime = bindingTime;
    }

    /**
     * 获取解绑时间
     *
     * @return unbinding_time - 解绑时间
     */
    public Date getUnbindingTime() {
        return unbindingTime;
    }

    /**
     * 设置解绑时间
     *
     * @param unbindingTime 解绑时间
     */
    public void setUnbindingTime(Date unbindingTime) {
        this.unbindingTime = unbindingTime;
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
}