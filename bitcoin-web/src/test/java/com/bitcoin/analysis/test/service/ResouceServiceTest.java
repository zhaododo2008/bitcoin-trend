package com.bitcoin.analysis.test.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bitcoin.analysis.resource.po.Resource;
import com.bitcoin.analysis.resource.service.IResourceService;
import com.bitcoin.analysis.resource.vo.req.ResourceQueryReq;
import com.bitcoin.analysis.test.BaseApplicationTests;
import com.bitcoin.analysis.user.facade.IUserFacade;
import com.bitcoin.analysis.user.vo.req.SnsUserSaveReq;
import com.bitcoin.analysis.user.vo.resp.SnsUserResp;
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

    @Autowired
    private IUserFacade userFacade;


    @Test
    public void queryByPage(){
        ResourceQueryReq queryReq = new ResourceQueryReq();
        queryReq.setPageNo(1);
        queryReq.setPageSize(10);
        IPage<Resource> page =  resourceService.queryByPage(queryReq);
        logger.info("queryByPage {}", JSON.toJSON(page));
    }


    @Test
    public void addWxUser(){

        SnsUserSaveReq snsUserSaveReq = new SnsUserSaveReq();
        snsUserSaveReq.setOpenId("ogB2A4r1h4Wbg9IlYo8RiMisxib8");
        snsUserSaveReq.setSessionKey("lRNlHTNPwPlinEe7WFeWSQ");
        SnsUserResp userResp = userFacade.addWxUser(snsUserSaveReq);
        logger.info("addWxUser result is  {}", JSON.toJSON(userResp));
    }



}
