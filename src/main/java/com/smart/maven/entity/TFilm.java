package com.smart.maven.entity;

import com.smart.maven.dao.Col;

import java.io.Serializable;

/**
 * 框架里底层原理
 */
public class TFilm implements Serializable {
    /**
     *
     */
    private String id;

    /**
     *
     */
    private String actor;

    /**
     * SSM mybatisa  xml 配置
     */
    @Col("cate_log_name")
    private String cateLogName;

    /**
     *
     */
    private String cateLogId;

    /**
     *
     */
    private Double evaluation;

    /**
     *
     */
    private String image;

    /**
     *
     */
    private Integer isUse;

    /**
     *
     */
    private String locName;

    /**
     *
     */
    private String locId;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String onDecade;

    /**
     *
     */
    private String plot;

    /**
     *
     */
    private String resolution;

    /**
     *
     */
    private String status;

    /**
     *
     */
    private String subClassName;

    /**
     *
     */
    private String subClassId;

    /**
     *
     */
    private String typeName;

    /**
     *
     */
    private String typeId;

    /**
     *
     */
    private String updateTime;

    /**
     *
     */
    private Integer isVip;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getCateLogName() {
        return cateLogName;
    }

    public void setCateLogName(String cateLogName) {
        this.cateLogName = cateLogName;
    }

    public String getCateLogId() {
        return cateLogId;
    }

    public void setCateLogId(String cateLogId) {
        this.cateLogId = cateLogId;
    }

    public Double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Double evaluation) {
        this.evaluation = evaluation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnDecade() {
        return onDecade;
    }

    public void setOnDecade(String onDecade) {
        this.onDecade = onDecade;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubClassName() {
        return subClassName;
    }

    public void setSubClassName(String subClassName) {
        this.subClassName = subClassName;
    }

    public String getSubClassId() {
        return subClassId;
    }

    public void setSubClassId(String subClassId) {
        this.subClassId = subClassId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }
}

