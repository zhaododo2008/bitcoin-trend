package com.bitcoin.analysis.model.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bitcoin.analysis.model.mapper.IHouseMapper;
import com.bitcoin.analysis.model.po.House;
import com.bitcoin.analysis.model.service.IHouseService;
import com.bitcoin.analysis.model.vo.req.HouseQueryReq;
import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhaododo
 **/

@Component
@Service(version = "1.0.0")
public class HouseServiceImpl extends ServiceImpl<IHouseMapper, House> implements IHouseService {

    @Override
    public IPage<House> findByPage(Page<House> page) {
        return getBaseMapper().selectPage(page,null);
    }

    @Override
    public IPage<House> queryByPage(HouseQueryReq queryReq) {

        Page<House> page = new Page<>(queryReq.getPageNo(),queryReq.getPageSize());
        QueryWrapper<House> queryWrapper = new QueryWrapper<>();

        if (StringUtils.isNoneEmpty(queryReq.getBuildingName())){
            queryWrapper.like("building_name",queryReq.getBuildingName());
        }
        return getBaseMapper().selectPage(page,queryWrapper);
    }
}
