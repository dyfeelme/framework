package com.zs.framework.biz.model;

import javax.persistence.*;

@Table(name = "about_info")
public class AboutInfo {
    /**
     * 关于ID
     */
    @Id
    @Column(name = "about_id")
    private Integer aboutId;

    /**
     * 关于类型
     */
    @Column(name = "about_type")
    private Integer aboutType;

    /**
     * 关于图片
     */
    @Column(name = "about_image")
    private String aboutImage;

    /**
     * 关于内容
     */
    @Column(name = "about_content")
    private String aboutContent;

    /**
     * 获取关于ID
     *
     * @return about_id - 关于ID
     */
    public Integer getAboutId() {
        return aboutId;
    }

    /**
     * 设置关于ID
     *
     * @param aboutId 关于ID
     */
    public void setAboutId(Integer aboutId) {
        this.aboutId = aboutId;
    }

    /**
     * 获取关于类型
     *
     * @return about_type - 关于类型
     */
    public Integer getAboutType() {
        return aboutType;
    }

    /**
     * 设置关于类型
     *
     * @param aboutType 关于类型
     */
    public void setAboutType(Integer aboutType) {
        this.aboutType = aboutType;
    }

    /**
     * 获取关于图片
     *
     * @return about_image - 关于图片
     */
    public String getAboutImage() {
        return aboutImage;
    }

    /**
     * 设置关于图片
     *
     * @param aboutImage 关于图片
     */
    public void setAboutImage(String aboutImage) {
        this.aboutImage = aboutImage;
    }

    /**
     * 获取关于内容
     *
     * @return about_content - 关于内容
     */
    public String getAboutContent() {
        return aboutContent;
    }

    /**
     * 设置关于内容
     *
     * @param aboutContent 关于内容
     */
    public void setAboutContent(String aboutContent) {
        this.aboutContent = aboutContent;
    }
}