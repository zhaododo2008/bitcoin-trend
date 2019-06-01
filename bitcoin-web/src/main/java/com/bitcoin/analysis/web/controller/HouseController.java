package com.bitcoin.analysis.web.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bitcoin.analysis.model.po.House;
import com.bitcoin.analysis.model.service.IHouseService;
import com.bitcoin.analysis.model.vo.req.HouseQueryReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaodododo
 **/

@RestController
@RequestMapping("/house")
@Api(tags = "户型模块Api")
public class HouseController {

    @Autowired
    private IHouseService houseService;

    @PostMapping("/findByPage")
    @ApiOperation(value="分页查询户型")
    public IPage<House> findByPage(int pageNo , int pageSize) {
        Page<House> page = new Page<>(pageNo, pageSize);
        return houseService.findByPage(page);
    }

    @PostMapping("/queryByPage")
    @ApiOperation(value="分页查询户型2")
    public IPage<House> queryByPage(@RequestBody HouseQueryReq queryReq) {
        return houseService.queryByPage(queryReq);
    }
}
