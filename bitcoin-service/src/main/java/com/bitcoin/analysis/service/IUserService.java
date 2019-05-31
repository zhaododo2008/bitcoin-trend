package com.bitcoin.analysis.service;


import com.bitcoin.analysis.po.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
}
