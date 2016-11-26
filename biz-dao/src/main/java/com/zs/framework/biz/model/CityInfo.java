package com.zs.framework.biz.model;

import javax.persistence.*;

@Table(name = "city_info")
public class CityInfo {
    /**
     * 城市ID
     */
    @Id
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 城市名称
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 拼音首字母
     */
    @Column(name = "city_initial_letter")
    private String cityInitialLetter;

    /**
     * app可见标识
     */
    @Column(name = "valid_flag")
    private Integer validFlag;

    /**
     * 获取城市ID
     *
     * @return city_id - 城市ID
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置城市ID
     *
     * @param cityId 城市ID
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取城市名称
     *
     * @return city_name - 城市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置城市名称
     *
     * @param cityName 城市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取拼音首字母
     *
     * @return city_initial_letter - 拼音首字母
     */
    public String getCityInitialLetter() {
        return cityInitialLetter;
    }

    /**
     * 设置拼音首字母
     *
     * @param cityInitialLetter 拼音首字母
     */
    public void setCityInitialLetter(String cityInitialLetter) {
        this.cityInitialLetter = cityInitialLetter;
    }

    /**
     * 获取app可见标识
     *
     * @return valid_flag - app可见标识
     */
    public Integer getValidFlag() {
        return validFlag;
    }

    /**
     * 设置app可见标识
     *
     * @param validFlag app可见标识
     */
    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }
}