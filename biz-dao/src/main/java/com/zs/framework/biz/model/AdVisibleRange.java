package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ad_visible_range")
public class AdVisibleRange {
    /**
     * 可见范围ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 广告ID
     */
    @Column(name = "ad_id")
    private Integer adId;

    /**
     * 城市ID
     */
    @Column(name = "city_id")
    private String cityId;

    /**
     * 显示顺序
     */
    @Column(name = "show_num")
    private Integer showNum;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者ID
     */
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 获取可见范围ID
     *
     * @return id - 可见范围ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置可见范围ID
     *
     * @param id 可见范围ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * 获取城市ID
     *
     * @return city_id - 城市ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 设置城市ID
     *
     * @param cityId 城市ID
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取显示顺序
     *
     * @return show_num - 显示顺序
     */
    public Integer getShowNum() {
        return showNum;
    }

    /**
     * 设置显示顺序
     *
     * @param showNum 显示顺序
     */
    public void setShowNum(Integer showNum) {
        this.showNum = showNum;
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
}