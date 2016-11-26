package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sms_waiting_send")
public class SmsWaitingSend {
    /**
     * 待发送短信ID
     */
    @Id
    @Column(name = "sms_waiting_send_id")
    private Integer smsWaitingSendId;

    /**
     * 短信内容
     */
    private String content;

    /**
     * 发送时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 发送状态
     */
    @Column(name = "send_status")
    private Integer sendStatus;

    /**
     * 短信类型
     */
    @Column(name = "sms_type")
    private Integer smsType;

    /**
     * 发送优先级
     */
    private Integer priority;

    /**
     * 操作员ID(发送者)
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 短信服务返回信息
     */
    @Column(name = "service_return_info")
    private String serviceReturnInfo;

    /**
     * 发送失败次数
     */
    @Column(name = "error_count")
    private Integer errorCount;

    /**
     * 消息群发记录ID
     */
    @Column(name = "group_send_id")
    private Integer groupSendId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 接收者手机号
     */
    @Column(name = "receive_mobile")
    private String receiveMobile;

    /**
     * 获取待发送短信ID
     *
     * @return sms_waiting_send_id - 待发送短信ID
     */
    public Integer getSmsWaitingSendId() {
        return smsWaitingSendId;
    }

    /**
     * 设置待发送短信ID
     *
     * @param smsWaitingSendId 待发送短信ID
     */
    public void setSmsWaitingSendId(Integer smsWaitingSendId) {
        this.smsWaitingSendId = smsWaitingSendId;
    }

    /**
     * 获取短信内容
     *
     * @return content - 短信内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置短信内容
     *
     * @param content 短信内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取发送时间
     *
     * @return send_time - 发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置发送时间
     *
     * @param sendTime 发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取发送状态
     *
     * @return send_status - 发送状态
     */
    public Integer getSendStatus() {
        return sendStatus;
    }

    /**
     * 设置发送状态
     *
     * @param sendStatus 发送状态
     */
    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * 获取短信类型
     *
     * @return sms_type - 短信类型
     */
    public Integer getSmsType() {
        return smsType;
    }

    /**
     * 设置短信类型
     *
     * @param smsType 短信类型
     */
    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }

    /**
     * 获取发送优先级
     *
     * @return priority - 发送优先级
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置发送优先级
     *
     * @param priority 发送优先级
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取操作员ID(发送者)
     *
     * @return admin_id - 操作员ID(发送者)
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置操作员ID(发送者)
     *
     * @param adminId 操作员ID(发送者)
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取短信服务返回信息
     *
     * @return service_return_info - 短信服务返回信息
     */
    public String getServiceReturnInfo() {
        return serviceReturnInfo;
    }

    /**
     * 设置短信服务返回信息
     *
     * @param serviceReturnInfo 短信服务返回信息
     */
    public void setServiceReturnInfo(String serviceReturnInfo) {
        this.serviceReturnInfo = serviceReturnInfo;
    }

    /**
     * 获取发送失败次数
     *
     * @return error_count - 发送失败次数
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * 设置发送失败次数
     *
     * @param errorCount 发送失败次数
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * 获取消息群发记录ID
     *
     * @return group_send_id - 消息群发记录ID
     */
    public Integer getGroupSendId() {
        return groupSendId;
    }

    /**
     * 设置消息群发记录ID
     *
     * @param groupSendId 消息群发记录ID
     */
    public void setGroupSendId(Integer groupSendId) {
        this.groupSendId = groupSendId;
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
     * 获取接收者手机号
     *
     * @return receive_mobile - 接收者手机号
     */
    public String getReceiveMobile() {
        return receiveMobile;
    }

    /**
     * 设置接收者手机号
     *
     * @param receiveMobile 接收者手机号
     */
    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile;
    }
}