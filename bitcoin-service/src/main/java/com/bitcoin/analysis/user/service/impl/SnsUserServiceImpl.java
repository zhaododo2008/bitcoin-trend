package com.bitcoin.analysis.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bitcoin.analysis.user.mapper.ISnsUserMapper;
import com.bitcoin.analysis.user.po.SnsUser;
import com.bitcoin.analysis.user.service.ISnsUserService;
import com.bitcoin.analysis.user.vo.req.SnsUserQueryReq;
import org.apache.dubbo.common.utils.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @author zhaododo
 **/

@Component
public class SnsUserServiceImpl extends ServiceImpl<ISnsUserMapper, SnsUser> implements ISnsUserService {
    @Override
    public SnsUser getOneByQuery(SnsUserQueryReq queryReq) {

        QueryWrapper<SnsUser> queryWrapper = new QueryWrapper<>();

        if (StringUtils.isNotEmpty(queryReq.getOpenId()))
        {
            queryWrapper.eq("open_id",queryReq.getOpenId());
        }

        return this.getOne(queryWrapper);
    }
}
