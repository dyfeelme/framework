package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_audit_history")
public class DataAuditHistory {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 数据类型
     */
    @Column(name = "data_type")
    private String dataType;

    /**
     * 业务日期
     */
    @Column(name = "data_date")
    private Date dataDate;

    /**
     * 对账时间
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * 对账结果
     */
    @Column(name = "check_result")
    private String checkResult;

    /**
     * 结果报告
     */
    private String report;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取数据类型
     *
     * @return data_type - 数据类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置数据类型
     *
     * @param dataType 数据类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 获取业务日期
     *
     * @return data_date - 业务日期
     */
    public Date getDataDate() {
        return dataDate;
    }

    /**
     * 设置业务日期
     *
     * @param dataDate 业务日期
     */
    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

    /**
     * 获取对账时间
     *
     * @return check_time - 对账时间
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * 设置对账时间
     *
     * @param checkTime 对账时间
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取对账结果
     *
     * @return check_result - 对账结果
     */
    public String getCheckResult() {
        return checkResult;
    }

    /**
     * 设置对账结果
     *
     * @param checkResult 对账结果
     */
    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    /**
     * 获取结果报告
     *
     * @return report - 结果报告
     */
    public String getReport() {
        return report;
    }

    /**
     * 设置结果报告
     *
     * @param report 结果报告
     */
    public void setReport(String report) {
        this.report = report;
    }
}