package com.bitcoin.analysis.model.vo.req;

import com.bitcoin.analysis.req.PageModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author zhaododo
 **/

@ApiModel(description = "户型分页查询请求参数")
public class HouseQueryReq extends PageModel {

    /**
     * 楼盘名称
     */
    @ApiModelProperty(value = "楼盘名称")
    private String buildingName;

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
}
