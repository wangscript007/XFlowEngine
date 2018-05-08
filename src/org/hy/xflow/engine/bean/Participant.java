package org.hy.xflow.engine.bean;

import org.hy.common.Date;





/**
 * 1. 工作流活动组件(节点)的参与人
 * 2. 工作流活动组件(节点)路由的参与人
 *
 * @author      ZhengWei
 * @createDate  2018-04-24
 * @version     v1.0
 */
public class Participant extends UserParticipant
{
    private static final long serialVersionUID = -4724247321457107633L;
	
    
	/** 主键ID */
    protected String participantID;
    
	/** 工作流的模板ID */
    protected String templateID;
    
    /** 活动ID */
    protected String activityID;
    
	/** 活动路由ID */
    protected String activityRouteID;
    
    /** 参与者类型（内存合成） */
    protected ParticipantType participantType;
    
	/** 创建人员ID */
    protected String createrID;
    
	/** 创建人员名称 */
    protected String creater;
    
	/** 创建时间 */
    protected Date createTime;
    
	
    
    /**
     * 获取：主键ID
     */
    public String getParticipantID()
    {
        return participantID;
    }
    
    
    /**
     * 设置：主键ID
     * 
     * @param participantID 
     */
    public void setParticipantID(String participantID)
    {
        this.participantID = participantID;
    }
    
    
    /**
     * 获取：活动ID
     */
    public String getActivityID()
    {
        return activityID;
    }

    
    /**
     * 设置：活动ID
     * 
     * @param activityID 
     */
    public void setActivityID(String activityID)
    {
        this.activityID = activityID;
    }
    

    /**
     * 获取：活动路由ID
     */
    public String getActivityRouteID()
    {
        return activityRouteID;
    }

    
    /**
     * 设置：活动路由ID
     * 
     * @param activityRouteID 
     */
    public void setActivityRouteID(String activityRouteID)
    {
        this.activityRouteID = activityRouteID;
    }


    /**
     * 获取：工作流的模板ID
     */
    public String getTemplateID()
    {
        return templateID;
    }

    
    /**
     * 设置：工作流的模板ID
     * 
     * @param templateID 
     */
    public void setTemplateID(String templateID)
    {
        this.templateID = templateID;
    }
    
    
    /**
     * 获取：参与者类型（内存合成）
     */
    public ParticipantType getParticipantType()
    {
        return participantType;
    }

    
    /**
     * 设置：参与者类型（内存合成）
     * 
     * @param participantType 
     */
    public void setParticipantType(ParticipantType participantType)
    {
        this.participantType = participantType;
    }


	/**
     * 获取：创建人员ID
     */
    public String getCreaterID()
    {
        return this.createrID;
    }

    
    /**
     * 设置：创建人员ID
     * 
     * @param i_CreaterID
     */
    public void setCreaterID(String i_CreaterID)
    {
        this.createrID = i_CreaterID;
    }
	
	
	/**
     * 获取：创建人员名称
     */
    public String getCreater()
    {
        return this.creater;
    }

    
    /**
     * 设置：创建人员名称
     * 
     * @param i_Creater
     */
    public void setCreater(String i_Creater)
    {
        this.creater = i_Creater;
    }
	
	
	/**
     * 获取：创建时间
     */
    public Date getCreateTime()
    {
        return this.createTime;
    }

    
    /**
     * 设置：创建时间
     * 
     * @param i_CreateTime
     */
    public void setCreateTime(Date i_CreateTime)
    {
        this.createTime = i_CreateTime;
    }

}
