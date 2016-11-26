package com.zs.framework.biz.model;

import javax.persistence.*;

@Table(name = "message_template_param")
public class MessageTemplateParam {
    /**
     * 参数ID
     */
    @Id
    @Column(name = "param_id")
    private Integer paramId;

    /**
     * 模版编号
     */
    @Column(name = "template_no")
    private String templateNo;

    /**
     * 参数中文名
     */
    @Column(name = "cn_name")
    private String cnName;

    /**
     * 参数英文名
     */
    @Column(name = "en_name")
    private String enName;

    /**
     * 获取参数ID
     *
     * @return param_id - 参数ID
     */
    public Integer getParamId() {
        return paramId;
    }

    /**
     * 设置参数ID
     *
     * @param paramId 参数ID
     */
    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    /**
     * 获取模版编号
     *
     * @return template_no - 模版编号
     */
    public String getTemplateNo() {
        return templateNo;
    }

    /**
     * 设置模版编号
     *
     * @param templateNo 模版编号
     */
    public void setTemplateNo(String templateNo) {
        this.templateNo = templateNo;
    }

    /**
     * 获取参数中文名
     *
     * @return cn_name - 参数中文名
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * 设置参数中文名
     *
     * @param cnName 参数中文名
     */
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    /**
     * 获取参数英文名
     *
     * @return en_name - 参数英文名
     */
    public String getEnName() {
        return enName;
    }

    /**
     * 设置参数英文名
     *
     * @param enName 参数英文名
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }
}