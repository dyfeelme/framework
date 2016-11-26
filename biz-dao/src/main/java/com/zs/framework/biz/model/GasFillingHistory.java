package com.zs.framework.biz.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "gas_filling_history")
public class GasFillingHistory {
    /**
     * 记录ID
     */
    @Id
    @Column(name = "record_id")
    private Integer recordId;

    /**
     * 外系统消费编号
     */
    @Column(name = "consume_item_id")
    private String consumeItemId;

    /**
     * 消费类型
     */
    @Column(name = "consume_type")
    private Integer consumeType;

    /**
     * 一卡通编码
     */
    @Column(name = "gas_card_no")
    private String gasCardNo;

    /**
     * 气站ID
     */
    @Column(name = "station_id")
    private Integer stationId;

    /**
     * 气站名称
     */
    @Column(name = "gas_station")
    private String gasStation;

    /**
     * 消费时间
     */
    @Column(name = "consume_time")
    private Date consumeTime;

    /**
     * 消费金额
     */
    @Column(name = "consume_money")
    private BigDecimal consumeMoney;

    /**
     * 备注
     */
    private String comment;

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
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

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
     * 获取外系统消费编号
     *
     * @return consume_item_id - 外系统消费编号
     */
    public String getConsumeItemId() {
        return consumeItemId;
    }

    /**
     * 设置外系统消费编号
     *
     * @param consumeItemId 外系统消费编号
     */
    public void setConsumeItemId(String consumeItemId) {
        this.consumeItemId = consumeItemId;
    }

    /**
     * 获取消费类型
     *
     * @return consume_type - 消费类型
     */
    public Integer getConsumeType() {
        return consumeType;
    }

    /**
     * 设置消费类型
     *
     * @param consumeType 消费类型
     */
    public void setConsumeType(Integer consumeType) {
        this.consumeType = consumeType;
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
     * 获取气站ID
     *
     * @return station_id - 气站ID
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 设置气站ID
     *
     * @param stationId 气站ID
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
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
     * 获取消费时间
     *
     * @return consume_time - 消费时间
     */
    public Date getConsumeTime() {
        return consumeTime;
    }

    /**
     * 设置消费时间
     *
     * @param consumeTime 消费时间
     */
    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }

    /**
     * 获取消费金额
     *
     * @return consume_money - 消费金额
     */
    public BigDecimal getConsumeMoney() {
        return consumeMoney;
    }

    /**
     * 设置消费金额
     *
     * @param consumeMoney 消费金额
     */
    public void setConsumeMoney(BigDecimal consumeMoney) {
        this.consumeMoney = consumeMoney;
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