package com.zs.framework.biz.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Member {
    /**
     * 会员ID
     */
    @Id
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 姓名
     */
    @Column(name = "member_name")
    private String memberName;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 手机
     */
    @Column(name = "mobile_no")
    private String mobileNo;

    /**
     * 驾驶执照
     */
    @Column(name = "driving_license")
    private String drivingLicense;

    /**
     * 车牌号
     */
    @Column(name = "car_no")
    private String carNo;

    /**
     * 邀请者ID
     */
    private Integer inviter;

    /**
     * 我的邀请码
     */
    @Column(name = "invite_code")
    private String inviteCode;

    /**
     * 余额
     */
    private BigDecimal blance;

    /**
     * 积分
     */
    private Integer bonus;

    /**
     * 会员状态
     */
    @Column(name = "member_state")
    private Integer memberState;

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
     * 注册时间
     */
    @Column(name = "reg_time")
    private Date regTime;

    /**
     * 会员头像URL
     */
    @Column(name = "member_pic")
    private String memberPic;

    /**
     * 注册时经度
     */
    private String longitude;

    /**
     * 注册时纬度
     */
    private String latitude;

    /**
     * 新易支付token
     */
    @Column(name = "pay_token")
    private String payToken;

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
     * 获取姓名
     *
     * @return member_name - 姓名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置姓名
     *
     * @param memberName 姓名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取手机
     *
     * @return mobile_no - 手机
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 设置手机
     *
     * @param mobileNo 手机
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 获取驾驶执照
     *
     * @return driving_license - 驾驶执照
     */
    public String getDrivingLicense() {
        return drivingLicense;
    }

    /**
     * 设置驾驶执照
     *
     * @param drivingLicense 驾驶执照
     */
    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    /**
     * 获取车牌号
     *
     * @return car_no - 车牌号
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 设置车牌号
     *
     * @param carNo 车牌号
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * 获取邀请者ID
     *
     * @return inviter - 邀请者ID
     */
    public Integer getInviter() {
        return inviter;
    }

    /**
     * 设置邀请者ID
     *
     * @param inviter 邀请者ID
     */
    public void setInviter(Integer inviter) {
        this.inviter = inviter;
    }

    /**
     * 获取我的邀请码
     *
     * @return invite_code - 我的邀请码
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置我的邀请码
     *
     * @param inviteCode 我的邀请码
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * 获取余额
     *
     * @return blance - 余额
     */
    public BigDecimal getBlance() {
        return blance;
    }

    /**
     * 设置余额
     *
     * @param blance 余额
     */
    public void setBlance(BigDecimal blance) {
        this.blance = blance;
    }

    /**
     * 获取积分
     *
     * @return bonus - 积分
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 设置积分
     *
     * @param bonus 积分
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取会员状态
     *
     * @return member_state - 会员状态
     */
    public Integer getMemberState() {
        return memberState;
    }

    /**
     * 设置会员状态
     *
     * @param memberState 会员状态
     */
    public void setMemberState(Integer memberState) {
        this.memberState = memberState;
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

    /**
     * 获取注册时间
     *
     * @return reg_time - 注册时间
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * 设置注册时间
     *
     * @param regTime 注册时间
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取会员头像URL
     *
     * @return member_pic - 会员头像URL
     */
    public String getMemberPic() {
        return memberPic;
    }

    /**
     * 设置会员头像URL
     *
     * @param memberPic 会员头像URL
     */
    public void setMemberPic(String memberPic) {
        this.memberPic = memberPic;
    }

    /**
     * 获取注册时经度
     *
     * @return longitude - 注册时经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置注册时经度
     *
     * @param longitude 注册时经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取注册时纬度
     *
     * @return latitude - 注册时纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置注册时纬度
     *
     * @param latitude 注册时纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取新易支付token
     *
     * @return pay_token - 新易支付token
     */
    public String getPayToken() {
        return payToken;
    }

    /**
     * 设置新易支付token
     *
     * @param payToken 新易支付token
     */
    public void setPayToken(String payToken) {
        this.payToken = payToken;
    }
}