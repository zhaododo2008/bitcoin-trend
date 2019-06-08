package com.bitcoin.analysis.web.controller;

import com.alibaba.fastjson.JSON;
import com.bitcoin.analysis.resource.service.IResourceService;
import com.bitcoin.analysis.resource.vo.req.ResourceQueryReq;
import com.bitcoin.analysis.resp.RespResult;
import com.bitcoin.analysis.resp.util.RespUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaododo
 **/

@RestController
@RequestMapping("/resource")
@Api(tags = "资源模块Api")
public class ResourceController {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private IResourceService resourceService;

    @PostMapping("/queryByPage")
    @ApiOperation(value="资源分页查询")
    public RespResult queryByPage(@RequestBody ResourceQueryReq queryReq) {
        logger.info("resource query param is {}", JSON.toJSON(queryReq));
        return RespUtil.success(resourceService.queryByPage(queryReq));
    }
}
