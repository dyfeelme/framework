package com.zs.framework.biz.model;

import javax.persistence.*;

@Table(name = "system_dic")
public class SystemDic {
    /**
     * 字典ID
     */
    @Id
    @Column(name = "dic_id")
    private Integer dicId;

    /**
     * 业务代码
     */
    @Column(name = "biz_no")
    private String bizNo;

    /**
     * 业务属性值
     */
    @Column(name = "biz_code")
    private Integer bizCode;

    /**
     * 业务属性名称
     */
    @Column(name = "biz_name")
    private String bizName;

    /**
     * 业务属性顺序
     */
    @Column(name = "biz_code_index")
    private Integer bizCodeIndex;

    /**
     * 获取字典ID
     *
     * @return dic_id - 字典ID
     */
    public Integer getDicId() {
        return dicId;
    }

    /**
     * 设置字典ID
     *
     * @param dicId 字典ID
     */
    public void setDicId(Integer dicId) {
        this.dicId = dicId;
    }

    /**
     * 获取业务代码
     *
     * @return biz_no - 业务代码
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * 设置业务代码
     *
     * @param bizNo 业务代码
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    /**
     * 获取业务属性值
     *
     * @return biz_code - 业务属性值
     */
    public Integer getBizCode() {
        return bizCode;
    }

    /**
     * 设置业务属性值
     *
     * @param bizCode 业务属性值
     */
    public void setBizCode(Integer bizCode) {
        this.bizCode = bizCode;
    }

    /**
     * 获取业务属性名称
     *
     * @return biz_name - 业务属性名称
     */
    public String getBizName() {
        return bizName;
    }

    /**
     * 设置业务属性名称
     *
     * @param bizName 业务属性名称
     */
    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    /**
     * 获取业务属性顺序
     *
     * @return biz_code_index - 业务属性顺序
     */
    public Integer getBizCodeIndex() {
        return bizCodeIndex;
    }

    /**
     * 设置业务属性顺序
     *
     * @param bizCodeIndex 业务属性顺序
     */
    public void setBizCodeIndex(Integer bizCodeIndex) {
        this.bizCodeIndex = bizCodeIndex;
    }
}