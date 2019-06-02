package com.bitcoin.analysis.web.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bitcoin.analysis.model.po.House;
import com.bitcoin.analysis.model.service.IHouseService;
import com.bitcoin.analysis.model.vo.req.HouseQueryReq;
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
@RequestMapping("/house")
@Api(tags = "户型模块Api")
public class HouseController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IHouseService houseService;

    @PostMapping("/findByPage")
    @ApiOperation(value="分页查询户型")
    public IPage<House> findByPage(int pageNo , int pageSize) {
        logger.info("param is {},{}",pageNo,pageSize);

        Page<House> page = new Page<>(pageNo, pageSize);
        return houseService.findByPage(page);
    }

    @PostMapping("/queryByPage")
    @ApiOperation(value="分页查询户型2")
    public IPage<House> queryByPage(@RequestBody HouseQueryReq queryReq) {
        return houseService.queryByPage(queryReq);
    }


    @PostMapping("/save")
    @ApiOperation(value="保存户型")
    public RespResult save(@RequestBody House house) {

        logger.info("save param is {}", JSON.toJSON(house));
        return RespUtil.success(houseService.save(house));
    }
}
