package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bonus_history")
public class BonusHistory {
    /**
     * 积分记录ID
     */
    @Id
    @Column(name = "bonus_history_id")
    private Integer bonusHistoryId;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 业务类型
     */
    @Column(name = "biz_type")
    private Integer bizType;

    /**
     * 业务记录ID
     */
    @Column(name = "biz_record_id")
    private Integer bizRecordId;

    /**
     * 积分变动额
     */
    @Column(name = "bonus_change")
    private Integer bonusChange;

    /**
     * 变动前积分额
     */
    @Column(name = "before_bonus")
    private Integer beforeBonus;

    /**
     * 变动积分时间
     */
    @Column(name = "bonus_charge_time")
    private Date bonusChargeTime;

    /**
     * 备注
     */
    private String comment;

    /**
     * 记录状态
     */
    private Integer state;

    /**
     * 获取积分记录ID
     *
     * @return bonus_history_id - 积分记录ID
     */
    public Integer getBonusHistoryId() {
        return bonusHistoryId;
    }

    /**
     * 设置积分记录ID
     *
     * @param bonusHistoryId 积分记录ID
     */
    public void setBonusHistoryId(Integer bonusHistoryId) {
        this.bonusHistoryId = bonusHistoryId;
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
     * 获取业务类型
     *
     * @return biz_type - 业务类型
     */
    public Integer getBizType() {
        return bizType;
    }

    /**
     * 设置业务类型
     *
     * @param bizType 业务类型
     */
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    /**
     * 获取业务记录ID
     *
     * @return biz_record_id - 业务记录ID
     */
    public Integer getBizRecordId() {
        return bizRecordId;
    }

    /**
     * 设置业务记录ID
     *
     * @param bizRecordId 业务记录ID
     */
    public void setBizRecordId(Integer bizRecordId) {
        this.bizRecordId = bizRecordId;
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

    /**
     * 获取变动前积分额
     *
     * @return before_bonus - 变动前积分额
     */
    public Integer getBeforeBonus() {
        return beforeBonus;
    }

    /**
     * 设置变动前积分额
     *
     * @param beforeBonus 变动前积分额
     */
    public void setBeforeBonus(Integer beforeBonus) {
        this.beforeBonus = beforeBonus;
    }

    /**
     * 获取变动积分时间
     *
     * @return bonus_charge_time - 变动积分时间
     */
    public Date getBonusChargeTime() {
        return bonusChargeTime;
    }

    /**
     * 设置变动积分时间
     *
     * @param bonusChargeTime 变动积分时间
     */
    public void setBonusChargeTime(Date bonusChargeTime) {
        this.bonusChargeTime = bonusChargeTime;
    }

    /**
     * 获取备注
     *
     * @return comment - 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment;
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
}