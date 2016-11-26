package com.zs.framework.biz.model;

import java.util.Date;
import javax.persistence.*;

public class Faq {
    /**
     * 问题ID
     */
    @Id
    @Column(name = "faq_id")
    private Integer faqId;

    /**
     * 分类ID
     */
    @Column(name = "question_type_id")
    private Integer questionTypeId;

    /**
     * 问题标签
     */
    @Column(name = "question_title")
    private String questionTitle;

    /**
     * 问题
     */
    private String question;

    /**
     * 问题答案
     */
    private String answer;

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
     * 获取问题ID
     *
     * @return faq_id - 问题ID
     */
    public Integer getFaqId() {
        return faqId;
    }

    /**
     * 设置问题ID
     *
     * @param faqId 问题ID
     */
    public void setFaqId(Integer faqId) {
        this.faqId = faqId;
    }

    /**
     * 获取分类ID
     *
     * @return question_type_id - 分类ID
     */
    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    /**
     * 设置分类ID
     *
     * @param questionTypeId 分类ID
     */
    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    /**
     * 获取问题标签
     *
     * @return question_title - 问题标签
     */
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * 设置问题标签
     *
     * @param questionTitle 问题标签
     */
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    /**
     * 获取问题
     *
     * @return question - 问题
     */
    public String getQuestion() {
        return question;
    }

    /**
     * 设置问题
     *
     * @param question 问题
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * 获取问题答案
     *
     * @return answer - 问题答案
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置问题答案
     *
     * @param answer 问题答案
     */
    public void setAnswer(String answer) {
        this.answer = answer;
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