package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

public class Advertisement {
    /**
     * 广告ID
     */
    @Id
    @Column(name = "ad_id")
    private Integer adId;

    /**
     * 广告类型
     */
    @Column(name = "advertise_type")
    private Integer advertiseType;

    /**
     * 广告内容ID
     */
    @Column(name = "advertise_content_id")
    private Integer advertiseContentId;

    /**
     * 广告标签
     */
    @Column(name = "ad_title")
    private String adTitle;

    /**
     * 广告图片URL
     */
    @Column(name = "advertise_pic")
    private String advertisePic;

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
     * 获取广告ID
     *
     * @return ad_id - 广告ID
     */
    public Integer getAdId() {
        return adId;
    }

    /**
     * 设置广告ID
     *
     * @param adId 广告ID
     */
    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    /**
     * 获取广告类型
     *
     * @return advertise_type - 广告类型
     */
    public Integer getAdvertiseType() {
        return advertiseType;
    }

    /**
     * 设置广告类型
     *
     * @param advertiseType 广告类型
     */
    public void setAdvertiseType(Integer advertiseType) {
        this.advertiseType = advertiseType;
    }

    /**
     * 获取广告内容ID
     *
     * @return advertise_content_id - 广告内容ID
     */
    public Integer getAdvertiseContentId() {
        return advertiseContentId;
    }

    /**
     * 设置广告内容ID
     *
     * @param advertiseContentId 广告内容ID
     */
    public void setAdvertiseContentId(Integer advertiseContentId) {
        this.advertiseContentId = advertiseContentId;
    }

    /**
     * 获取广告标签
     *
     * @return ad_title - 广告标签
     */
    public String getAdTitle() {
        return adTitle;
    }

    /**
     * 设置广告标签
     *
     * @param adTitle 广告标签
     */
    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    /**
     * 获取广告图片URL
     *
     * @return advertise_pic - 广告图片URL
     */
    public String getAdvertisePic() {
        return advertisePic;
    }

    /**
     * 设置广告图片URL
     *
     * @param advertisePic 广告图片URL
     */
    public void setAdvertisePic(String advertisePic) {
        this.advertisePic = advertisePic;
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
}