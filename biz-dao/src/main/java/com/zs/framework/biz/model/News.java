package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

public class News {
    /**
     * 资讯详情ID
     */
    @Id
    @Column(name = "news_id")
    private Integer newsId;

    /**
     * 标题
     */
    private String title;

    /**
     * 摘要
     */
    @Column(name = "abstract")
    private String abstracts;

    /**
     * 资讯相关气站
     */
    @Column(name = "related_station")
    private String relatedStation;

    /**
     * 资讯状态
     */
    @Column(name = "news_status")
    private Integer newsStatus;

    /**
     * 发布时间
     */
    @Column(name = "release_time")
    private Date releaseTime;

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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 资讯列表图
     */
    @Column(name = "news_pic")
    private String newsPic;

    /**
     * 分享话术
     */
    @Column(name = "share_message")
    private String shareMessage;

    /**
     * 资讯内容
     */
    private String content;

    /**
     * 获取资讯详情ID
     *
     * @return news_id - 资讯详情ID
     */
    public Integer getNewsId() {
        return newsId;
    }

    /**
     * 设置资讯详情ID
     *
     * @param newsId 资讯详情ID
     */
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取摘要
     *
     * @return abstract - 摘要
     */
    public String getAbstracts() {
        return abstracts;
    }

    /**
     * 设置摘要
     *
     * @param abstract 摘要
     */
    public void setAbstract(String abstracts) {
        this.abstracts = abstracts;
    }

    /**
     * 获取资讯相关气站
     *
     * @return related_station - 资讯相关气站
     */
    public String getRelatedStation() {
        return relatedStation;
    }

    /**
     * 设置资讯相关气站
     *
     * @param relatedStation 资讯相关气站
     */
    public void setRelatedStation(String relatedStation) {
        this.relatedStation = relatedStation;
    }

    /**
     * 获取资讯状态
     *
     * @return news_status - 资讯状态
     */
    public Integer getNewsStatus() {
        return newsStatus;
    }

    /**
     * 设置资讯状态
     *
     * @param newsStatus 资讯状态
     */
    public void setNewsStatus(Integer newsStatus) {
        this.newsStatus = newsStatus;
    }

    /**
     * 获取发布时间
     *
     * @return release_time - 发布时间
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * 设置发布时间
     *
     * @param releaseTime 发布时间
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
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
     * 获取资讯列表图
     *
     * @return news_pic - 资讯列表图
     */
    public String getNewsPic() {
        return newsPic;
    }

    /**
     * 设置资讯列表图
     *
     * @param newsPic 资讯列表图
     */
    public void setNewsPic(String newsPic) {
        this.newsPic = newsPic;
    }

    /**
     * 获取分享话术
     *
     * @return share_message - 分享话术
     */
    public String getShareMessage() {
        return shareMessage;
    }

    /**
     * 设置分享话术
     *
     * @param shareMessage 分享话术
     */
    public void setShareMessage(String shareMessage) {
        this.shareMessage = shareMessage;
    }

    /**
     * 获取资讯内容
     *
     * @return content - 资讯内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置资讯内容
     *
     * @param content 资讯内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}