package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "system_operator")
public class SystemOperator {
    /**
     * 管理员ID（员工ID）
     */
    @Id
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 姓名
     */
    @Column(name = "operator_name")
    private String operatorName;

    /**
     * 员工编号
     */
    @Column(name = "employee_no")
    private String employeeNo;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号码
     */
    @Column(name = "mobile_no")
    private String mobileNo;

    /**
     * 记录状态
     */
    private Integer state;

    /**
     * 密码错误次数
     */
    @Column(name = "password_fail_count")
    private Integer passwordFailCount;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_datetime")
    private Date createDatetime;

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
     * 获取登录名
     *
     * @return login_name - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取姓名
     *
     * @return operator_name - 姓名
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设置姓名
     *
     * @param operatorName 姓名
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * 获取员工编号
     *
     * @return employee_no - 员工编号
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * 设置员工编号
     *
     * @param employeeNo 员工编号
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取手机号码
     *
     * @return mobile_no - 手机号码
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 设置手机号码
     *
     * @param mobileNo 手机号码
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
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
     * 获取密码错误次数
     *
     * @return password_fail_count - 密码错误次数
     */
    public Integer getPasswordFailCount() {
        return passwordFailCount;
    }

    /**
     * 设置密码错误次数
     *
     * @param passwordFailCount 密码错误次数
     */
    public void setPasswordFailCount(Integer passwordFailCount) {
        this.passwordFailCount = passwordFailCount;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
     * @return create_datetime - 创建时间
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * 设置创建时间
     *
     * @param createDatetime 创建时间
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
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