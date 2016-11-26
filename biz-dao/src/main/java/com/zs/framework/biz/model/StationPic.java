package com.zs.framework.biz.model;

import javax.persistence.*;

@Table(name = "station_pic")
public class StationPic {
    /**
     * 气站图片ID
     */
    @Id
    @Column(name = "station_pic_id")
    private Integer stationPicId;

    /**
     * 图片URL
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 图片类型
     */
    @Column(name = "pic_type")
    private Integer picType;

    /**
     * 气站ID
     */
    @Column(name = "station_id")
    private Integer stationId;

    /**
     * 显示顺序号
     */
    @Column(name = "display_index")
    private Integer displayIndex;

    /**
     * 获取气站图片ID
     *
     * @return station_pic_id - 气站图片ID
     */
    public Integer getStationPicId() {
        return stationPicId;
    }

    /**
     * 设置气站图片ID
     *
     * @param stationPicId 气站图片ID
     */
    public void setStationPicId(Integer stationPicId) {
        this.stationPicId = stationPicId;
    }

    /**
     * 获取图片URL
     *
     * @return pic_url - 图片URL
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置图片URL
     *
     * @param picUrl 图片URL
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取图片类型
     *
     * @return pic_type - 图片类型
     */
    public Integer getPicType() {
        return picType;
    }

    /**
     * 设置图片类型
     *
     * @param picType 图片类型
     */
    public void setPicType(Integer picType) {
        this.picType = picType;
    }

    /**
     * 获取气站ID
     *
     * @return station_id - 气站ID
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 设置气站ID
     *
     * @param stationId 气站ID
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * 获取显示顺序号
     *
     * @return display_index - 显示顺序号
     */
    public Integer getDisplayIndex() {
        return displayIndex;
    }

    /**
     * 设置显示顺序号
     *
     * @param displayIndex 显示顺序号
     */
    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }
}