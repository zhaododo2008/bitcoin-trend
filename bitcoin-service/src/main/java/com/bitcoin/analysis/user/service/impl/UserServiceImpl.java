package com.bitcoin.analysis.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bitcoin.analysis.user.mapper.IUserMapper;
import com.bitcoin.analysis.user.po.User;
import com.bitcoin.analysis.user.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author zhaododo
 **/

@Component
public class UserServiceImpl extends ServiceImpl<IUserMapper, User> implements IUserService {
}
