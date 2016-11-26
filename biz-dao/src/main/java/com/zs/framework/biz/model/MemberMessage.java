package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "member_message")
public class MemberMessage {
    /**
     * 消息ID
     */
    @Id
    @Column(name = "message_id")
    private Long messageId;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 消息类型
     */
    @Column(name = "message_type")
    private Integer messageType;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 消息群发记录ID
     */
    @Column(name = "group_send_id")
    private Integer groupSendId;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 已读标识
     */
    @Column(name = "read_flag")
    private Integer readFlag;

    /**
     * App隐藏标识
     */
    @Column(name = "app_hide_flag")
    private Integer appHideFlag;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取消息ID
     *
     * @return message_id - 消息ID
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * 设置消息ID
     *
     * @param messageId 消息ID
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
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
     * 获取消息类型
     *
     * @return message_type - 消息类型
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * 设置消息类型
     *
     * @param messageType 消息类型
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取消息标题
     *
     * @return title - 消息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置消息标题
     *
     * @param title 消息标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取消息内容
     *
     * @return content - 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置消息内容
     *
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content;
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
     * 获取创建用户
     *
     * @return create_user - 创建用户
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取已读标识
     *
     * @return read_flag - 已读标识
     */
    public Integer getReadFlag() {
        return readFlag;
    }

    /**
     * 设置已读标识
     *
     * @param readFlag 已读标识
     */
    public void setReadFlag(Integer readFlag) {
        this.readFlag = readFlag;
    }

    /**
     * 获取App隐藏标识
     *
     * @return app_hide_flag - App隐藏标识
     */
    public Integer getAppHideFlag() {
        return appHideFlag;
    }

    /**
     * 设置App隐藏标识
     *
     * @param appHideFlag App隐藏标识
     */
    public void setAppHideFlag(Integer appHideFlag) {
        this.appHideFlag = appHideFlag;
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
}