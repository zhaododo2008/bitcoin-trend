package com.bitcoin.analysis.resource.vo.req;

import com.bitcoin.analysis.req.PageModel;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaododo
 */
public class ResourceQueryReq extends PageModel implements Serializable{
    private static final long serialVersionUID = 8751282105532159742L;

    /**
     * 简述
     */
    private String resume;

    /**
     * 发布时间
     */
    private Date postTime;

    /**
     * 分类 0: 默认值 1: java,2: python
     */
    private Integer type;

    /**
     * 搜索tag
     */
    private String tag;

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}