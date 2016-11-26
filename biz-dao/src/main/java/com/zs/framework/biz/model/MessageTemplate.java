package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "message_template")
public class MessageTemplate {
    /**
     * 模版编号
     */
    @Id
    @Column(name = "template_no")
    private String templateNo;

    /**
     * 模板说明
     */
    private String description;

    /**
     * 模板内容
     */
    private String content;

    /**
     * 发送方式
     */
    @Column(name = "send_type")
    private String sendType;

    /**
     * 更新用户
     */
    @Column(name = "update_user")
    private Integer updateUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取模版编号
     *
     * @return template_no - 模版编号
     */
    public String getTemplateNo() {
        return templateNo;
    }

    /**
     * 设置模版编号
     *
     * @param templateNo 模版编号
     */
    public void setTemplateNo(String templateNo) {
        this.templateNo = templateNo;
    }

    /**
     * 获取模板说明
     *
     * @return description - 模板说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置模板说明
     *
     * @param description 模板说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取模板内容
     *
     * @return content - 模板内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置模板内容
     *
     * @param content 模板内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取发送方式
     *
     * @return send_type - 发送方式
     */
    public String getSendType() {
        return sendType;
    }

    /**
     * 设置发送方式
     *
     * @param sendType 发送方式
     */
    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    /**
     * 获取更新用户
     *
     * @return update_user - 更新用户
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新用户
     *
     * @param updateUser 更新用户
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
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