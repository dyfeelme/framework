package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "queuing_history")
public class QueuingHistory {
    /**
     * 排号ID
     */
    @Id
    @Column(name = "queuing_id")
    private Integer queuingId;

    /**
     * 气站ID
     */
    @Column(name = "station_id")
    private Integer stationId;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 排队号码
     */
    @Column(name = "queuing_no")
    private Integer queuingNo;

    /**
     * 号码状态
     */
    @Column(name = "queuing_no_status")
    private Integer queuingNoStatus;

    /**
     * 气站操作人员ID
     */
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 服务时间
     */
    @Column(name = "service_time")
    private Date serviceTime;

    /**
     * 消息提醒状态
     */
    @Column(name = "reminding_status")
    private Integer remindingStatus;

    /**
     * 获取排号ID
     *
     * @return queuing_id - 排号ID
     */
    public Integer getQueuingId() {
        return queuingId;
    }

    /**
     * 设置排号ID
     *
     * @param queuingId 排号ID
     */
    public void setQueuingId(Integer queuingId) {
        this.queuingId = queuingId;
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
     * 获取排队号码
     *
     * @return queuing_no - 排队号码
     */
    public Integer getQueuingNo() {
        return queuingNo;
    }

    /**
     * 设置排队号码
     *
     * @param queuingNo 排队号码
     */
    public void setQueuingNo(Integer queuingNo) {
        this.queuingNo = queuingNo;
    }

    /**
     * 获取号码状态
     *
     * @return queuing_no_status - 号码状态
     */
    public Integer getQueuingNoStatus() {
        return queuingNoStatus;
    }

    /**
     * 设置号码状态
     *
     * @param queuingNoStatus 号码状态
     */
    public void setQueuingNoStatus(Integer queuingNoStatus) {
        this.queuingNoStatus = queuingNoStatus;
    }

    /**
     * 获取气站操作人员ID
     *
     * @return operator_id - 气站操作人员ID
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 设置气站操作人员ID
     *
     * @param operatorId 气站操作人员ID
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
     * 获取服务时间
     *
     * @return service_time - 服务时间
     */
    public Date getServiceTime() {
        return serviceTime;
    }

    /**
     * 设置服务时间
     *
     * @param serviceTime 服务时间
     */
    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    /**
     * 获取消息提醒状态
     *
     * @return reminding_status - 消息提醒状态
     */
    public Integer getRemindingStatus() {
        return remindingStatus;
    }

    /**
     * 设置消息提醒状态
     *
     * @param remindingStatus 消息提醒状态
     */
    public void setRemindingStatus(Integer remindingStatus) {
        this.remindingStatus = remindingStatus;
    }
}