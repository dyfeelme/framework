package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "feedback_detail")
public class FeedbackDetail {
    /**
     * 用户反馈ID
     */
    @Id
    @Column(name = "feedback_id")
    private Integer feedbackId;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 用户手机号
     */
    @Column(name = "member_mobile")
    private String memberMobile;

    /**
     * 操作系统类型
     */
    @Column(name = "os_type")
    private String osType;

    /**
     * 操作系统版本
     */
    @Column(name = "os_version")
    private String osVersion;

    /**
     * 软件版本
     */
    @Column(name = "software_version")
    private String softwareVersion;

    /**
     * 反馈内容
     */
    @Column(name = "feedback_content")
    private String feedbackContent;

    /**
     * 反馈时间
     */
    @Column(name = "feedback_time")
    private Date feedbackTime;

    /**
     * 获取用户反馈ID
     *
     * @return feedback_id - 用户反馈ID
     */
    public Integer getFeedbackId() {
        return feedbackId;
    }

    /**
     * 设置用户反馈ID
     *
     * @param feedbackId 用户反馈ID
     */
    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
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
     * 获取用户手机号
     *
     * @return member_mobile - 用户手机号
     */
    public String getMemberMobile() {
        return memberMobile;
    }

    /**
     * 设置用户手机号
     *
     * @param memberMobile 用户手机号
     */
    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    /**
     * 获取操作系统类型
     *
     * @return os_type - 操作系统类型
     */
    public String getOsType() {
        return osType;
    }

    /**
     * 设置操作系统类型
     *
     * @param osType 操作系统类型
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * 获取操作系统版本
     *
     * @return os_version - 操作系统版本
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * 设置操作系统版本
     *
     * @param osVersion 操作系统版本
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * 获取软件版本
     *
     * @return software_version - 软件版本
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * 设置软件版本
     *
     * @param softwareVersion 软件版本
     */
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    /**
     * 获取反馈内容
     *
     * @return feedback_content - 反馈内容
     */
    public String getFeedbackContent() {
        return feedbackContent;
    }

    /**
     * 设置反馈内容
     *
     * @param feedbackContent 反馈内容
     */
    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    /**
     * 获取反馈时间
     *
     * @return feedback_time - 反馈时间
     */
    public Date getFeedbackTime() {
        return feedbackTime;
    }

    /**
     * 设置反馈时间
     *
     * @param feedbackTime 反馈时间
     */
    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }
}