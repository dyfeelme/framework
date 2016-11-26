package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "attendance_record")
public class AttendanceRecord {
    /**
     * 记录ID
     */
    @Id
    @Column(name = "record_id")
    private Integer recordId;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 签到时间
     */
    @Column(name = "sign_time")
    private Date signTime;

    /**
     * 积分变动额
     */
    @Column(name = "bonus_change")
    private Integer bonusChange;

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
     * 获取签到时间
     *
     * @return sign_time - 签到时间
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * 设置签到时间
     *
     * @param signTime 签到时间
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * 获取积分变动额
     *
     * @return bonus_change - 积分变动额
     */
    public Integer getBonusChange() {
        return bonusChange;
    }

    /**
     * 设置积分变动额
     *
     * @param bonusChange 积分变动额
     */
    public void setBonusChange(Integer bonusChange) {
        this.bonusChange = bonusChange;
    }
}