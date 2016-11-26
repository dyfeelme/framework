package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "station_around")
public class StationAround {
    /**
     * 商户ID
     */
    @Id
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 气站ID
     */
    @Column(name = "station_id")
    private Integer stationId;

    /**
     * 商家名称
     */
    @Column(name = "merchant_name")
    private String merchantName;

    /**
     * 商户经度
     */
    private String longitude;

    /**
     * 商户纬度
     */
    private String latitude;

    /**
     * 商户地址
     */
    @Column(name = "merchant_address")
    private String merchantAddress;

    /**
     * 电话
     */
    private String phone;

    /**
     * 商户简介
     */
    @Column(name = "merchant_instr")
    private String merchantInstr;

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
     * 获取商户ID
     *
     * @return merchant_id - 商户ID
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户ID
     *
     * @param merchantId 商户ID
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
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
     * 获取商家名称
     *
     * @return merchant_name - 商家名称
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * 设置商家名称
     *
     * @param merchantName 商家名称
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * 获取商户经度
     *
     * @return longitude - 商户经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置商户经度
     *
     * @param longitude 商户经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取商户纬度
     *
     * @return latitude - 商户纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置商户纬度
     *
     * @param latitude 商户纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取商户地址
     *
     * @return merchant_address - 商户地址
     */
    public String getMerchantAddress() {
        return merchantAddress;
    }

    /**
     * 设置商户地址
     *
     * @param merchantAddress 商户地址
     */
    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
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
     * 获取商户简介
     *
     * @return merchant_instr - 商户简介
     */
    public String getMerchantInstr() {
        return merchantInstr;
    }

    /**
     * 设置商户简介
     *
     * @param merchantInstr 商户简介
     */
    public void setMerchantInstr(String merchantInstr) {
        this.merchantInstr = merchantInstr;
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