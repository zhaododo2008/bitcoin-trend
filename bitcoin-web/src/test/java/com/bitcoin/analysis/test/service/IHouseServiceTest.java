package com.bitcoin.analysis.test.service;

import com.alibaba.fastjson.JSON;
import com.bitcoin.analysis.model.po.House;
import com.bitcoin.analysis.model.service.IHouseService;
import com.bitcoin.analysis.test.BaseApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class IHouseServiceTest extends BaseApplicationTests {


    private  final  static  Logger logger = LoggerFactory.getLogger(BaseApplicationTests.class);
    @Autowired
    private IHouseService houseService;

    @Test
    public void save(){
        House house = new House();
        house.setAddUserId(1212);
        houseService.save(house);
        logger.info("house is {}", JSON.toJSON(house));


    }


}