package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "queuing_temp")
public class QueuingTemp {
    /**
     * 气站ID
     */
    @Id
    @Column(name = "station_id")
    private Integer stationId;

    /**
     * 当前号码
     */
    @Column(name = "current_queuing_no")
    private Integer currentQueuingNo;

    /**
     * 操作员ID
     */
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 发号时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取当前号码
     *
     * @return current_queuing_no - 当前号码
     */
    public Integer getCurrentQueuingNo() {
        return currentQueuingNo;
    }

    /**
     * 设置当前号码
     *
     * @param currentQueuingNo 当前号码
     */
    public void setCurrentQueuingNo(Integer currentQueuingNo) {
        this.currentQueuingNo = currentQueuingNo;
    }

    /**
     * 获取操作员ID
     *
     * @return operator_id - 操作员ID
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 设置操作员ID
     *
     * @param operatorId 操作员ID
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取发号时间
     *
     * @return update_time - 发号时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置发号时间
     *
     * @param updateTime 发号时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}