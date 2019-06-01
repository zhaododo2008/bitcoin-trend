package com.bitcoin.analysis.user.service;


import com.bitcoin.analysis.user.po.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
}
