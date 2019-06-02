package com.bitcoin.analysis.model.po;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhaododo
 */
@TableName("t_house")
public class House implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
     * 楼盘id
     */
    private Long buildingId;

    /**
     * 楼盘名称
     */
    private String buildingName;

    /**
     * 方案楼盘所属公司省份id
     */
    private Short companyId;

    /**
     * 户型id
     */
    private Long housingId;

    /**
     * 户型名称
     */
    private String housingName;

    /**
     * 户型大小
     */
    private BigDecimal housingSize;

    /**
     * 户型类型：0: 普通户型，1: DNA户型
     */
    private Integer type;

    /**
     * 0:默认 1:有模型
     */
    private Short modelFlag;

    /**
     * 户型图地址
     */
    private String normalPic;

    /**
     * 空间标示图地址
     */
    private String markPic;

    /**
     * 户型PAK文件
     */
    private String pakFile;

    /**
     * 添加人
     */
    private Integer addUserId;

    /**
     * 更新人
     */
    private Integer updUserId;

    /**
     * 1: 删除 0: 未删除
     */
    private Short delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Short getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Short companyId) {
        this.companyId = companyId;
    }

    public Long getHousingId() {
        return housingId;
    }

    public void setHousingId(Long housingId) {
        this.housingId = housingId;
    }

    public String getHousingName() {
        return housingName;
    }

    public void setHousingName(String housingName) {
        this.housingName = housingName;
    }

    public BigDecimal getHousingSize() {
        return housingSize;
    }

    public void setHousingSize(BigDecimal housingSize) {
        this.housingSize = housingSize;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Short getModelFlag() {
        return modelFlag;
    }

    public void setModelFlag(Short modelFlag) {
        this.modelFlag = modelFlag;
    }

    public String getNormalPic() {
        return normalPic;
    }

    public void setNormalPic(String normalPic) {
        this.normalPic = normalPic;
    }

    public String getMarkPic() {
        return markPic;
    }

    public void setMarkPic(String markPic) {
        this.markPic = markPic;
    }

    public String getPakFile() {
        return pakFile;
    }

    public void setPakFile(String pakFile) {
        this.pakFile = pakFile;
    }

    public Integer getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    public Integer getUpdUserId() {
        return updUserId;
    }

    public void setUpdUserId(Integer updUserId) {
        this.updUserId = updUserId;
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}