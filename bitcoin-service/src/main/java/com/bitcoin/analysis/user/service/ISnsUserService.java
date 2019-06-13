package com.bitcoin.analysis.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bitcoin.analysis.user.po.SnsUser;
import com.bitcoin.analysis.user.vo.req.SnsUserQueryReq;

/**
 * @author zhaododo
 **/

public interface ISnsUserService extends IService<SnsUser> {


    /**
     * 按参数查询
     * @param queryReq
     * @return
     */
    SnsUser getOneByQuery(SnsUserQueryReq queryReq);



}
