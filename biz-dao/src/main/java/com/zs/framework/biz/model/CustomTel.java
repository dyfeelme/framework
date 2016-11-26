package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "custom_tel")
public class CustomTel {
    /**
     * 记录ID
     */
    @Id
    @Column(name = "record_id")
    private Integer recordId;

    /**
     * 客服电话
     */
    @Column(name = "service_phone")
    private String servicePhone;

    /**
     * 客服标签
     */
    @Column(name = "service_title")
    private String serviceTitle;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者ID
     */
    @Column(name = "operator_id")
    private Integer operatorId;

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
     * 获取客服电话
     *
     * @return service_phone - 客服电话
     */
    public String getServicePhone() {
        return servicePhone;
    }

    /**
     * 设置客服电话
     *
     * @param servicePhone 客服电话
     */
    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    /**
     * 获取客服标签
     *
     * @return service_title - 客服标签
     */
    public String getServiceTitle() {
        return serviceTitle;
    }

    /**
     * 设置客服标签
     *
     * @param serviceTitle 客服标签
     */
    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
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
}