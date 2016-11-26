package com.zs.framework.biz.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "charge_history")
public class ChargeHistory {
    /**
     * 记录ID
     */
    @Id
    @Column(name = "record_id")
    private Integer recordId;

    /**
     * 充值类型
     */
    @Column(name = "charge_type")
    private Integer chargeType;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 线上充值单据号
     */
    @Column(name = "bill_no")
    private String billNo;

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
     * 气站名称
     */
    @Column(name = "gas_station")
    private String gasStation;

    /**
     * 外系统充值编号
     */
    @Column(name = "recharge_record_id")
    private String rechargeRecordId;

    /**
     * 充值后气卡余额
     */
    @Column(name = "gas_card_balance")
    private BigDecimal gasCardBalance;

    /**
     * 充值时间
     */
    @Column(name = "charge_time")
    private Date chargeTime;

    /**
     * 充值结果
     */
    private Integer state;

    /**
     * 充值结果消息
     */
    private String comment;

    /**
     * 支付方式
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 支付金额
     */
    @Column(name = "charge_money")
    private BigDecimal chargeMoney;

    /**
     * 在线支付交易流水号
     */
    @Column(name = "pay_no")
    private String payNo;

    /**
     * 在线支付状态
     */
    @Column(name = "online_payment_status")
    private Integer onlinePaymentStatus;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 对账状态
     */
    @Column(name = "account_state")
    private Integer accountState;

    /**
     * 操作者ID
     */
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 删除流水号
     */
    @Column(name = "delete_no")
    private String deleteNo;

    /**
     * 获取记录ID
     *
     * @return record_id - 记录ID
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * 设置记录ID
     *
     * @param recordId 记录ID
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取充值类型
     *
     * @return charge_type - 充值类型
     */
    public Integer getChargeType() {
        return chargeType;
    }

    /**
     * 设置充值类型
     *
     * @param chargeType 充值类型
     */
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
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
     * 获取线上充值单据号
     *
     * @return bill_no - 线上充值单据号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置线上充值单据号
     *
     * @param billNo 线上充值单据号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
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
     * 获取气站名称
     *
     * @return gas_station - 气站名称
     */
    public String getGasStation() {
        return gasStation;
    }

    /**
     * 设置气站名称
     *
     * @param gasStation 气站名称
     */
    public void setGasStation(String gasStation) {
        this.gasStation = gasStation;
    }

    /**
     * 获取外系统充值编号
     *
     * @return recharge_record_id - 外系统充值编号
     */
    public String getRechargeRecordId() {
        return rechargeRecordId;
    }

    /**
     * 设置外系统充值编号
     *
     * @param rechargeRecordId 外系统充值编号
     */
    public void setRechargeRecordId(String rechargeRecordId) {
        this.rechargeRecordId = rechargeRecordId;
    }

    /**
     * 获取充值后气卡余额
     *
     * @return gas_card_balance - 充值后气卡余额
     */
    public BigDecimal getGasCardBalance() {
        return gasCardBalance;
    }

    /**
     * 设置充值后气卡余额
     *
     * @param gasCardBalance 充值后气卡余额
     */
    public void setGasCardBalance(BigDecimal gasCardBalance) {
        this.gasCardBalance = gasCardBalance;
    }

    /**
     * 获取充值时间
     *
     * @return charge_time - 充值时间
     */
    public Date getChargeTime() {
        return chargeTime;
    }

    /**
     * 设置充值时间
     *
     * @param chargeTime 充值时间
     */
    public void setChargeTime(Date chargeTime) {
        this.chargeTime = chargeTime;
    }

    /**
     * 获取充值结果
     *
     * @return state - 充值结果
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置充值结果
     *
     * @param state 充值结果
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取充值结果消息
     *
     * @return comment - 充值结果消息
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置充值结果消息
     *
     * @param comment 充值结果消息
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取支付方式
     *
     * @return pay_type - 支付方式
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付方式
     *
     * @param payType 支付方式
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取支付金额
     *
     * @return charge_money - 支付金额
     */
    public BigDecimal getChargeMoney() {
        return chargeMoney;
    }

    /**
     * 设置支付金额
     *
     * @param chargeMoney 支付金额
     */
    public void setChargeMoney(BigDecimal chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    /**
     * 获取在线支付交易流水号
     *
     * @return pay_no - 在线支付交易流水号
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * 设置在线支付交易流水号
     *
     * @param payNo 在线支付交易流水号
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * 获取在线支付状态
     *
     * @return online_payment_status - 在线支付状态
     */
    public Integer getOnlinePaymentStatus() {
        return onlinePaymentStatus;
    }

    /**
     * 设置在线支付状态
     *
     * @param onlinePaymentStatus 在线支付状态
     */
    public void setOnlinePaymentStatus(Integer onlinePaymentStatus) {
        this.onlinePaymentStatus = onlinePaymentStatus;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取对账状态
     *
     * @return account_state - 对账状态
     */
    public Integer getAccountState() {
        return accountState;
    }

    /**
     * 设置对账状态
     *
     * @param accountState 对账状态
     */
    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }

    /**
     * 获取操作者ID
     *
     * @return operator_id - 操作者ID
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 设置操作者ID
     *
     * @param operatorId 操作者ID
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 获取删除流水号
     *
     * @return delete_no - 删除流水号
     */
    public String getDeleteNo() {
        return deleteNo;
    }

    /**
     * 设置删除流水号
     *
     * @param deleteNo 删除流水号
     */
    public void setDeleteNo(String deleteNo) {
        this.deleteNo = deleteNo;
    }
}