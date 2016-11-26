package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "login_history")
public class LoginHistory {
    /**
     * 登录历史ID
     */
    @Id
    @Column(name = "history_id")
    private Integer historyId;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 手机IMEI
     */
    @Column(name = "phone_imei")
    private String phoneImei;

    /**
     * 设备ID
     */
    @Column(name = "device_id")
    private String deviceId;

    /**
     * 手机类型
     */
    @Column(name = "phone_type")
    private String phoneType;

    /**
     * 手机系统
     */
    @Column(name = "phone_os")
    private String phoneOs;

    /**
     * 软件版本
     */
    @Column(name = "software_version")
    private String softwareVersion;

    /**
     * 获取登录历史ID
     *
     * @return history_id - 登录历史ID
     */
    public Integer getHistoryId() {
        return historyId;
    }

    /**
     * 设置登录历史ID
     *
     * @param historyId 登录历史ID
     */
    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
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
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取手机IMEI
     *
     * @return phone_imei - 手机IMEI
     */
    public String getPhoneImei() {
        return phoneImei;
    }

    /**
     * 设置手机IMEI
     *
     * @param phoneImei 手机IMEI
     */
    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }

    /**
     * 获取设备ID
     *
     * @return device_id - 设备ID
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备ID
     *
     * @param deviceId 设备ID
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取手机类型
     *
     * @return phone_type - 手机类型
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * 设置手机类型
     *
     * @param phoneType 手机类型
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * 获取手机系统
     *
     * @return phone_os - 手机系统
     */
    public String getPhoneOs() {
        return phoneOs;
    }

    /**
     * 设置手机系统
     *
     * @param phoneOs 手机系统
     */
    public void setPhoneOs(String phoneOs) {
        this.phoneOs = phoneOs;
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
}