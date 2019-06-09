package com.bitcoin.analysis.test.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bitcoin.analysis.resource.po.Resource;
import com.bitcoin.analysis.resource.service.IResourceService;
import com.bitcoin.analysis.resource.vo.req.ResourceQueryReq;
import com.bitcoin.analysis.test.BaseApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhaojun on 2019-06-09.
 **/

public class ResouceServiceTest extends BaseApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private IResourceService resourceService;


    @Test
    public void queryByPage(){
        ResourceQueryReq queryReq = new ResourceQueryReq();
        queryReq.setPageNo(1);
        queryReq.setPageSize(10);
        IPage<Resource> page =  resourceService.queryByPage(queryReq);
        logger.info("queryByPage {}", JSON.toJSON(page));
    }



}
