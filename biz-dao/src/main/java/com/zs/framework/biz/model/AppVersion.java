package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_version")
public class AppVersion {
    /**
     * 版本ID
     */
    @Id
    @Column(name = "version_id")
    private Integer versionId;

    /**
     * APP内部版本号
     */
    @Column(name = "internal_version_no")
    private Integer internalVersionNo;

    /**
     * APP外部版本号
     */
    @Column(name = "version_no")
    private String versionNo;

    /**
     * APP平台
     */
    private String platform;

    /**
     * 更新说明
     */
    @Column(name = "update_description")
    private String updateDescription;

    /**
     * APP更新URL
     */
    @Column(name = "update_url")
    private String updateUrl;

    /**
     * App类型
     */
    @Column(name = "app_type")
    private Integer appType;

    /**
     * 实际版本号
     */
    @Column(name = "real_edition")
    private Integer realEdition;

    /**
     * 最低版本号
     */
    @Column(name = "lowest_edition")
    private Integer lowestEdition;

    /**
     * 强制更新标志
     */
    @Column(name = "force_update_flag")
    private Integer forceUpdateFlag;

    /**
     * APP新版本发布日期
     */
    @Column(name = "release_date")
    private Date releaseDate;

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
     * 获取版本ID
     *
     * @return version_id - 版本ID
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置版本ID
     *
     * @param versionId 版本ID
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * 获取APP内部版本号
     *
     * @return internal_version_no - APP内部版本号
     */
    public Integer getInternalVersionNo() {
        return internalVersionNo;
    }

    /**
     * 设置APP内部版本号
     *
     * @param internalVersionNo APP内部版本号
     */
    public void setInternalVersionNo(Integer internalVersionNo) {
        this.internalVersionNo = internalVersionNo;
    }

    /**
     * 获取APP外部版本号
     *
     * @return version_no - APP外部版本号
     */
    public String getVersionNo() {
        return versionNo;
    }

    /**
     * 设置APP外部版本号
     *
     * @param versionNo APP外部版本号
     */
    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * 获取APP平台
     *
     * @return platform - APP平台
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 设置APP平台
     *
     * @param platform APP平台
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 获取更新说明
     *
     * @return update_description - 更新说明
     */
    public String getUpdateDescription() {
        return updateDescription;
    }

    /**
     * 设置更新说明
     *
     * @param updateDescription 更新说明
     */
    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    /**
     * 获取APP更新URL
     *
     * @return update_url - APP更新URL
     */
    public String getUpdateUrl() {
        return updateUrl;
    }

    /**
     * 设置APP更新URL
     *
     * @param updateUrl APP更新URL
     */
    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    /**
     * 获取App类型
     *
     * @return app_type - App类型
     */
    public Integer getAppType() {
        return appType;
    }

    /**
     * 设置App类型
     *
     * @param appType App类型
     */
    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    /**
     * 获取实际版本号
     *
     * @return real_edition - 实际版本号
     */
    public Integer getRealEdition() {
        return realEdition;
    }

    /**
     * 设置实际版本号
     *
     * @param realEdition 实际版本号
     */
    public void setRealEdition(Integer realEdition) {
        this.realEdition = realEdition;
    }

    /**
     * 获取最低版本号
     *
     * @return lowest_edition - 最低版本号
     */
    public Integer getLowestEdition() {
        return lowestEdition;
    }

    /**
     * 设置最低版本号
     *
     * @param lowestEdition 最低版本号
     */
    public void setLowestEdition(Integer lowestEdition) {
        this.lowestEdition = lowestEdition;
    }

    /**
     * 获取强制更新标志
     *
     * @return force_update_flag - 强制更新标志
     */
    public Integer getForceUpdateFlag() {
        return forceUpdateFlag;
    }

    /**
     * 设置强制更新标志
     *
     * @param forceUpdateFlag 强制更新标志
     */
    public void setForceUpdateFlag(Integer forceUpdateFlag) {
        this.forceUpdateFlag = forceUpdateFlag;
    }

    /**
     * 获取APP新版本发布日期
     *
     * @return release_date - APP新版本发布日期
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * 设置APP新版本发布日期
     *
     * @param releaseDate APP新版本发布日期
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
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
}