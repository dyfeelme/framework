package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

public class Corp {
    /**
     * 公司ID
     */
    @Id
    @Column(name = "corp_id")
    private Integer corpId;

    /**
     * 公司编码
     */
    @Column(name = "corp_no")
    private Integer corpNo;

    /**
     * 公司名
     */
    @Column(name = "corp_name")
    private String corpName;

    /**
     * 商户号
     */
    @Column(name = "merchant_no")
    private String merchantNo;

    /**
     * 上线标识
     */
    @Column(name = "available_flag")
    private Integer availableFlag;

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
     * 获取公司ID
     *
     * @return corp_id - 公司ID
     */
    public Integer getCorpId() {
        return corpId;
    }

    /**
     * 设置公司ID
     *
     * @param corpId 公司ID
     */
    public void setCorpId(Integer corpId) {
        this.corpId = corpId;
    }

    /**
     * 获取公司编码
     *
     * @return corp_no - 公司编码
     */
    public Integer getCorpNo() {
        return corpNo;
    }

    /**
     * 设置公司编码
     *
     * @param corpNo 公司编码
     */
    public void setCorpNo(Integer corpNo) {
        this.corpNo = corpNo;
    }

    /**
     * 获取公司名
     *
     * @return corp_name - 公司名
     */
    public String getCorpName() {
        return corpName;
    }

    /**
     * 设置公司名
     *
     * @param corpName 公司名
     */
    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    /**
     * 获取商户号
     *
     * @return merchant_no - 商户号
     */
    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 设置商户号
     *
     * @param merchantNo 商户号
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    /**
     * 获取上线标识
     *
     * @return available_flag - 上线标识
     */
    public Integer getAvailableFlag() {
        return availableFlag;
    }

    /**
     * 设置上线标识
     *
     * @param availableFlag 上线标识
     */
    public void setAvailableFlag(Integer availableFlag) {
        this.availableFlag = availableFlag;
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
}