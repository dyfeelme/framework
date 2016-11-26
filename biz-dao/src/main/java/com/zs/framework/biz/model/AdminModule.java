package com.zs.framework.biz.model;

import javax.persistence.*;

@Table(name = "admin_module")
public class AdminModule {
    /**
     * 菜单功能ID
     */
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 菜单功能编号
     */
    @Column(name = "module_no")
    private String moduleNo;

    /**
     * 菜单功能名称
     */
    @Column(name = "module_name")
    private String moduleName;

    /**
     * Action路径
     */
    @Column(name = "action_path")
    private String actionPath;

    /**
     * 分组名称
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 显示顺序
     */
    @Column(name = "display_index")
    private Integer displayIndex;

    /**
     * 获取菜单功能ID
     *
     * @return menu_id - 菜单功能ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单功能ID
     *
     * @param menuId 菜单功能ID
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取菜单功能编号
     *
     * @return module_no - 菜单功能编号
     */
    public String getModuleNo() {
        return moduleNo;
    }

    /**
     * 设置菜单功能编号
     *
     * @param moduleNo 菜单功能编号
     */
    public void setModuleNo(String moduleNo) {
        this.moduleNo = moduleNo;
    }

    /**
     * 获取菜单功能名称
     *
     * @return module_name - 菜单功能名称
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 设置菜单功能名称
     *
     * @param moduleName 菜单功能名称
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * 获取Action路径
     *
     * @return action_path - Action路径
     */
    public String getActionPath() {
        return actionPath;
    }

    /**
     * 设置Action路径
     *
     * @param actionPath Action路径
     */
    public void setActionPath(String actionPath) {
        this.actionPath = actionPath;
    }

    /**
     * 获取分组名称
     *
     * @return group_name - 分组名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置分组名称
     *
     * @param groupName 分组名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取显示顺序
     *
     * @return display_index - 显示顺序
     */
    public Integer getDisplayIndex() {
        return displayIndex;
    }

    /**
     * 设置显示顺序
     *
     * @param displayIndex 显示顺序
     */
    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }
}