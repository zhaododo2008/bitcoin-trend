package com.bitcoin.analysis.user.service.impl;

import com.bitcoin.analysis.user.mapper.IUserMapper;
import com.bitcoin.analysis.user.po.User;
import com.bitcoin.analysis.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }
}
