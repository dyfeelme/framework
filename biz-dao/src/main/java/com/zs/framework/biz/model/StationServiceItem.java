package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "station_service_item")
public class StationServiceItem {
    /**
     * 服务项目ID
     */
    @Id
    @Column(name = "service_item_id")
    private Integer serviceItemId;

    /**
     * 服务名称
     */
    @Column(name = "service_name")
    private String serviceName;

    /**
     * 项目图片
     */
    @Column(name = "item_image")
    private String itemImage;

    /**
     * 更新用户
     */
    @Column(name = "update_user")
    private Integer updateUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 显示顺序号
     */
    @Column(name = "display_index")
    private Integer displayIndex;

    /**
     * 获取服务项目ID
     *
     * @return service_item_id - 服务项目ID
     */
    public Integer getServiceItemId() {
        return serviceItemId;
    }

    /**
     * 设置服务项目ID
     *
     * @param serviceItemId 服务项目ID
     */
    public void setServiceItemId(Integer serviceItemId) {
        this.serviceItemId = serviceItemId;
    }

    /**
     * 获取服务名称
     *
     * @return service_name - 服务名称
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 设置服务名称
     *
     * @param serviceName 服务名称
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取项目图片
     *
     * @return item_image - 项目图片
     */
    public String getItemImage() {
        return itemImage;
    }

    /**
     * 设置项目图片
     *
     * @param itemImage 项目图片
     */
    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    /**
     * 获取更新用户
     *
     * @return update_user - 更新用户
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新用户
     *
     * @param updateUser 更新用户
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
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