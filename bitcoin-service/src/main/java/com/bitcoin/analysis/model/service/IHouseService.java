package com.bitcoin.analysis.model.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bitcoin.analysis.model.po.House;
import com.bitcoin.analysis.model.vo.req.HouseQueryReq;

/**
 * @author zhaododo
 **/

public interface IHouseService extends IService<House> {

  IPage<House> findByPage(Page<House> page);

  IPage<House> queryByPage(HouseQueryReq queryReq);

}
