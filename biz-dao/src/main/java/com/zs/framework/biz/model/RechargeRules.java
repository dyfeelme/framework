package com.zs.framework.biz.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "recharge_rules")
public class RechargeRules {
    /**
     * 记录ID
     */
    @Id
    @Column(name = "record_id")
    private Integer recordId;

    /**
     * LNG线上充值奖励积分
     */
    @Column(name = "lng_online_bonus")
    private Integer lngOnlineBonus;

    /**
     * LNG线下充值奖励积分
     */
    @Column(name = "lng_offline_bonus")
    private Integer lngOfflineBonus;

    /**
     * LNG活动充值金额下限（包含线上线下）
     */
    @Column(name = "lngact_amount_limit")
    private BigDecimal lngactAmountLimit;

    /**
     * LNG赠送金额
     */
    @Column(name = "lng_rebate_amount")
    private BigDecimal lngRebateAmount;

    /**
     * CNG线上充值奖励积分
     */
    @Column(name = "cng_online_bonus")
    private Integer cngOnlineBonus;

    /**
     * CNG线下充值奖励积分
     */
    @Column(name = "cng_offline_bonus")
    private Integer cngOfflineBonus;

    /**
     * CNG活动充值金额下限（包含线上线下）
     */
    @Column(name = "cngact_amount_limit")
    private BigDecimal cngactAmountLimit;

    /**
     * CNG赠送金额
     */
    @Column(name = "cng_rebate_amount")
    private BigDecimal cngRebateAmount;

    /**
     * 公司ID
     */
    @Column(name = "corp_id")
    private Integer corpId;

    /**
     * 公司编码
     */
    @Column(name = "corp_no")
    private Integer corpNo;

    /**
     * 记录状态
     */
    private Integer state;

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
     * 获取LNG线上充值奖励积分
     *
     * @return lng_online_bonus - LNG线上充值奖励积分
     */
    public Integer getLngOnlineBonus() {
        return lngOnlineBonus;
    }

    /**
     * 设置LNG线上充值奖励积分
     *
     * @param lngOnlineBonus LNG线上充值奖励积分
     */
    public void setLngOnlineBonus(Integer lngOnlineBonus) {
        this.lngOnlineBonus = lngOnlineBonus;
    }

    /**
     * 获取LNG线下充值奖励积分
     *
     * @return lng_offline_bonus - LNG线下充值奖励积分
     */
    public Integer getLngOfflineBonus() {
        return lngOfflineBonus;
    }

    /**
     * 设置LNG线下充值奖励积分
     *
     * @param lngOfflineBonus LNG线下充值奖励积分
     */
    public void setLngOfflineBonus(Integer lngOfflineBonus) {
        this.lngOfflineBonus = lngOfflineBonus;
    }

    /**
     * 获取LNG活动充值金额下限（包含线上线下）
     *
     * @return lngact_amount_limit - LNG活动充值金额下限（包含线上线下）
     */
    public BigDecimal getLngactAmountLimit() {
        return lngactAmountLimit;
    }

    /**
     * 设置LNG活动充值金额下限（包含线上线下）
     *
     * @param lngactAmountLimit LNG活动充值金额下限（包含线上线下）
     */
    public void setLngactAmountLimit(BigDecimal lngactAmountLimit) {
        this.lngactAmountLimit = lngactAmountLimit;
    }

    /**
     * 获取LNG赠送金额
     *
     * @return lng_rebate_amount - LNG赠送金额
     */
    public BigDecimal getLngRebateAmount() {
        return lngRebateAmount;
    }

    /**
     * 设置LNG赠送金额
     *
     * @param lngRebateAmount LNG赠送金额
     */
    public void setLngRebateAmount(BigDecimal lngRebateAmount) {
        this.lngRebateAmount = lngRebateAmount;
    }

    /**
     * 获取CNG线上充值奖励积分
     *
     * @return cng_online_bonus - CNG线上充值奖励积分
     */
    public Integer getCngOnlineBonus() {
        return cngOnlineBonus;
    }

    /**
     * 设置CNG线上充值奖励积分
     *
     * @param cngOnlineBonus CNG线上充值奖励积分
     */
    public void setCngOnlineBonus(Integer cngOnlineBonus) {
        this.cngOnlineBonus = cngOnlineBonus;
    }

    /**
     * 获取CNG线下充值奖励积分
     *
     * @return cng_offline_bonus - CNG线下充值奖励积分
     */
    public Integer getCngOfflineBonus() {
        return cngOfflineBonus;
    }

    /**
     * 设置CNG线下充值奖励积分
     *
     * @param cngOfflineBonus CNG线下充值奖励积分
     */
    public void setCngOfflineBonus(Integer cngOfflineBonus) {
        this.cngOfflineBonus = cngOfflineBonus;
    }

    /**
     * 获取CNG活动充值金额下限（包含线上线下）
     *
     * @return cngact_amount_limit - CNG活动充值金额下限（包含线上线下）
     */
    public BigDecimal getCngactAmountLimit() {
        return cngactAmountLimit;
    }

    /**
     * 设置CNG活动充值金额下限（包含线上线下）
     *
     * @param cngactAmountLimit CNG活动充值金额下限（包含线上线下）
     */
    public void setCngactAmountLimit(BigDecimal cngactAmountLimit) {
        this.cngactAmountLimit = cngactAmountLimit;
    }

    /**
     * 获取CNG赠送金额
     *
     * @return cng_rebate_amount - CNG赠送金额
     */
    public BigDecimal getCngRebateAmount() {
        return cngRebateAmount;
    }

    /**
     * 设置CNG赠送金额
     *
     * @param cngRebateAmount CNG赠送金额
     */
    public void setCngRebateAmount(BigDecimal cngRebateAmount) {
        this.cngRebateAmount = cngRebateAmount;
    }

    /**
     * 获取公司ID
     *
     * @return corp_id - 公司ID
     */
    public Integer getCorpId() {
        return corpId;
    }

    /**
     * 设置公司ID
     *
     * @param corpId 公司ID
     */
    public void setCorpId(Integer corpId) {
        this.corpId = corpId;
    }

    /**
     * 获取公司编码
     *
     * @return corp_no - 公司编码
     */
    public Integer getCorpNo() {
        return corpNo;
    }

    /**
     * 设置公司编码
     *
     * @param corpNo 公司编码
     */
    public void setCorpNo(Integer corpNo) {
        this.corpNo = corpNo;
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
}