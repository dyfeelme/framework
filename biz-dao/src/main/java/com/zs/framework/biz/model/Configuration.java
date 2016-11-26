package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

public class Configuration {
    /**
     * 参数配置ID
     */
    @Id
    @Column(name = "configuration_id")
    private Integer configurationId;

    /**
     * 参数分类
     */
    @Column(name = "config_type")
    private Integer configType;

    /**
     * 参数名称
     */
    @Column(name = "config_name")
    private String configName;

    /**
     * 参数key
     */
    @Column(name = "item_key")
    private String itemKey;

    /**
     * 参数value
     */
    @Column(name = "item_value")
    private String itemValue;

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
     * 备注
     */
    private String commnet;

    /**
     * 获取参数配置ID
     *
     * @return configuration_id - 参数配置ID
     */
    public Integer getConfigurationId() {
        return configurationId;
    }

    /**
     * 设置参数配置ID
     *
     * @param configurationId 参数配置ID
     */
    public void setConfigurationId(Integer configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * 获取参数分类
     *
     * @return config_type - 参数分类
     */
    public Integer getConfigType() {
        return configType;
    }

    /**
     * 设置参数分类
     *
     * @param configType 参数分类
     */
    public void setConfigType(Integer configType) {
        this.configType = configType;
    }

    /**
     * 获取参数名称
     *
     * @return config_name - 参数名称
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * 设置参数名称
     *
     * @param configName 参数名称
     */
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    /**
     * 获取参数key
     *
     * @return item_key - 参数key
     */
    public String getItemKey() {
        return itemKey;
    }

    /**
     * 设置参数key
     *
     * @param itemKey 参数key
     */
    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    /**
     * 获取参数value
     *
     * @return item_value - 参数value
     */
    public String getItemValue() {
        return itemValue;
    }

    /**
     * 设置参数value
     *
     * @param itemValue 参数value
     */
    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
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

    /**
     * 获取备注
     *
     * @return commnet - 备注
     */
    public String getCommnet() {
        return commnet;
    }

    /**
     * 设置备注
     *
     * @param commnet 备注
     */
    public void setCommnet(String commnet) {
        this.commnet = commnet;
    }
}