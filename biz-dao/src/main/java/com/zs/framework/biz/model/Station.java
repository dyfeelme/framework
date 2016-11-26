package com.zs.framework.biz.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Station {
    /**
     * 气站ID
     */
    @Id
    @Column(name = "station_id")
    private Integer stationId;

    /**
     * 气站名称
     */
    @Column(name = "station_name")
    private String stationName;

    /**
     * 所属城市
     */
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 是否可见
     */
    @Column(name = "visible_flag")
    private Integer visibleFlag;

    /**
     * 气站经度
     */
    private String longitude;

    /**
     * 气站纬度
     */
    private String latitude;

    /**
     * 气站地址
     */
    @Column(name = "station_address")
    private String stationAddress;

    /**
     * 电话
     */
    private String phone;

    /**
     * 是否支持排号
     */
    @Column(name = "is_arrang")
    private Integer isArrang;

    /**
     * 营业时间
     */
    @Column(name = "business_time")
    private String businessTime;

    /**
     * LNG挂牌价
     */
    @Column(name = "lng_price")
    private BigDecimal lngPrice;

    /**
     * CNG挂牌价
     */
    @Column(name = "cng_price")
    private BigDecimal cngPrice;

    /**
     * 气站简介
     */
    @Column(name = "station_instr")
    private String stationInstr;

    /**
     * 服务项目ID
     */
    @Column(name = "service_item_id")
    private String serviceItemId;

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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取气站名称
     *
     * @return station_name - 气站名称
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 设置气站名称
     *
     * @param stationName 气站名称
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * 获取所属城市
     *
     * @return city_id - 所属城市
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置所属城市
     *
     * @param cityId 所属城市
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取是否可见
     *
     * @return visible_flag - 是否可见
     */
    public Integer getVisibleFlag() {
        return visibleFlag;
    }

    /**
     * 设置是否可见
     *
     * @param visibleFlag 是否可见
     */
    public void setVisibleFlag(Integer visibleFlag) {
        this.visibleFlag = visibleFlag;
    }

    /**
     * 获取气站经度
     *
     * @return longitude - 气站经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置气站经度
     *
     * @param longitude 气站经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取气站纬度
     *
     * @return latitude - 气站纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置气站纬度
     *
     * @param latitude 气站纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取气站地址
     *
     * @return station_address - 气站地址
     */
    public String getStationAddress() {
        return stationAddress;
    }

    /**
     * 设置气站地址
     *
     * @param stationAddress 气站地址
     */
    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取是否支持排号
     *
     * @return is_arrang - 是否支持排号
     */
    public Integer getIsArrang() {
        return isArrang;
    }

    /**
     * 设置是否支持排号
     *
     * @param isArrang 是否支持排号
     */
    public void setIsArrang(Integer isArrang) {
        this.isArrang = isArrang;
    }

    /**
     * 获取营业时间
     *
     * @return business_time - 营业时间
     */
    public String getBusinessTime() {
        return businessTime;
    }

    /**
     * 设置营业时间
     *
     * @param businessTime 营业时间
     */
    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    /**
     * 获取LNG挂牌价
     *
     * @return lng_price - LNG挂牌价
     */
    public BigDecimal getLngPrice() {
        return lngPrice;
    }

    /**
     * 设置LNG挂牌价
     *
     * @param lngPrice LNG挂牌价
     */
    public void setLngPrice(BigDecimal lngPrice) {
        this.lngPrice = lngPrice;
    }

    /**
     * 获取CNG挂牌价
     *
     * @return cng_price - CNG挂牌价
     */
    public BigDecimal getCngPrice() {
        return cngPrice;
    }

    /**
     * 设置CNG挂牌价
     *
     * @param cngPrice CNG挂牌价
     */
    public void setCngPrice(BigDecimal cngPrice) {
        this.cngPrice = cngPrice;
    }

    /**
     * 获取气站简介
     *
     * @return station_instr - 气站简介
     */
    public String getStationInstr() {
        return stationInstr;
    }

    /**
     * 设置气站简介
     *
     * @param stationInstr 气站简介
     */
    public void setStationInstr(String stationInstr) {
        this.stationInstr = stationInstr;
    }

    /**
     * 获取服务项目ID
     *
     * @return service_item_id - 服务项目ID
     */
    public String getServiceItemId() {
        return serviceItemId;
    }

    /**
     * 设置服务项目ID
     *
     * @param serviceItemId 服务项目ID
     */
    public void setServiceItemId(String serviceItemId) {
        this.serviceItemId = serviceItemId;
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