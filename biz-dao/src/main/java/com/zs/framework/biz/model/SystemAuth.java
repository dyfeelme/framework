package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "system_auth")
public class SystemAuth {
    /**
     * 系统权限ID
     */
    @Id
    @Column(name = "system_auth_id")
    private Integer systemAuthId;

    /**
     * 管理员ID（员工ID）
     */
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 气站ID
     */
    @Column(name = "station_id")
    private String stationId;

    /**
     * 记录状态
     */
    private Integer state;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 菜单权限
     */
    @Column(name = "menu_rights")
    private String menuRights;

    /**
     * 动作权限
     */
    @Column(name = "action_rights")
    private String actionRights;

    /**
     * 获取系统权限ID
     *
     * @return system_auth_id - 系统权限ID
     */
    public Integer getSystemAuthId() {
        return systemAuthId;
    }

    /**
     * 设置系统权限ID
     *
     * @param systemAuthId 系统权限ID
     */
    public void setSystemAuthId(Integer systemAuthId) {
        this.systemAuthId = systemAuthId;
    }

    /**
     * 获取管理员ID（员工ID）
     *
     * @return operator_id - 管理员ID（员工ID）
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 设置管理员ID（员工ID）
     *
     * @param operatorId 管理员ID（员工ID）
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取气站ID
     *
     * @return station_id - 气站ID
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * 设置气站ID
     *
     * @param stationId 气站ID
     */
    public void setStationId(String stationId) {
        this.stationId = stationId;
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
     * 获取创建用户
     *
     * @return create_user - 创建用户
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
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
     * 获取菜单权限
     *
     * @return menu_rights - 菜单权限
     */
    public String getMenuRights() {
        return menuRights;
    }

    /**
     * 设置菜单权限
     *
     * @param menuRights 菜单权限
     */
    public void setMenuRights(String menuRights) {
        this.menuRights = menuRights;
    }

    /**
     * 获取动作权限
     *
     * @return action_rights - 动作权限
     */
    public String getActionRights() {
        return actionRights;
    }

    /**
     * 设置动作权限
     *
     * @param actionRights 动作权限
     */
    public void setActionRights(String actionRights) {
        this.actionRights = actionRights;
    }
}