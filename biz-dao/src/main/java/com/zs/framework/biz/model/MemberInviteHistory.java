package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "member_invite_history")
public class MemberInviteHistory {
    /**
     * 邀请记录ID
     */
    @Id
    @Column(name = "invite_id")
    private Integer inviteId;

    /**
     * 邀请者ID
     */
    @Column(name = "inviter_id")
    private Integer inviterId;

    /**
     * 新注册用户id
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 新用户电话
     */
    @Column(name = "to_mobile_no")
    private String toMobileNo;

    /**
     * 邀请获得积分
     */
    @Column(name = "gained_bonus")
    private Integer gainedBonus;

    /**
     * 邀请时间
     */
    @Column(name = "invite_time")
    private Date inviteTime;

    /**
     * 激活时间
     */
    @Column(name = "activate_time")
    private Date activateTime;

    /**
     * 激活标志
     */
    @Column(name = "activate_flag")
    private Integer activateFlag;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取邀请记录ID
     *
     * @return invite_id - 邀请记录ID
     */
    public Integer getInviteId() {
        return inviteId;
    }

    /**
     * 设置邀请记录ID
     *
     * @param inviteId 邀请记录ID
     */
    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
    }

    /**
     * 获取邀请者ID
     *
     * @return inviter_id - 邀请者ID
     */
    public Integer getInviterId() {
        return inviterId;
    }

    /**
     * 设置邀请者ID
     *
     * @param inviterId 邀请者ID
     */
    public void setInviterId(Integer inviterId) {
        this.inviterId = inviterId;
    }

    /**
     * 获取新注册用户id
     *
     * @return member_id - 新注册用户id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置新注册用户id
     *
     * @param memberId 新注册用户id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取新用户电话
     *
     * @return to_mobile_no - 新用户电话
     */
    public String getToMobileNo() {
        return toMobileNo;
    }

    /**
     * 设置新用户电话
     *
     * @param toMobileNo 新用户电话
     */
    public void setToMobileNo(String toMobileNo) {
        this.toMobileNo = toMobileNo;
    }

    /**
     * 获取邀请获得积分
     *
     * @return gained_bonus - 邀请获得积分
     */
    public Integer getGainedBonus() {
        return gainedBonus;
    }

    /**
     * 设置邀请获得积分
     *
     * @param gainedBonus 邀请获得积分
     */
    public void setGainedBonus(Integer gainedBonus) {
        this.gainedBonus = gainedBonus;
    }

    /**
     * 获取邀请时间
     *
     * @return invite_time - 邀请时间
     */
    public Date getInviteTime() {
        return inviteTime;
    }

    /**
     * 设置邀请时间
     *
     * @param inviteTime 邀请时间
     */
    public void setInviteTime(Date inviteTime) {
        this.inviteTime = inviteTime;
    }

    /**
     * 获取激活时间
     *
     * @return activate_time - 激活时间
     */
    public Date getActivateTime() {
        return activateTime;
    }

    /**
     * 设置激活时间
     *
     * @param activateTime 激活时间
     */
    public void setActivateTime(Date activateTime) {
        this.activateTime = activateTime;
    }

    /**
     * 获取激活标志
     *
     * @return activate_flag - 激活标志
     */
    public Integer getActivateFlag() {
        return activateFlag;
    }

    /**
     * 设置激活标志
     *
     * @param activateFlag 激活标志
     */
    public void setActivateFlag(Integer activateFlag) {
        this.activateFlag = activateFlag;
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