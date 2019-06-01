package com.bitcoin.analysis.web.controller;

import com.bitcoin.analysis.user.po.User;
import com.bitcoin.analysis.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("list")
    public List<User> list(){
        return userService.findAll();
    }
}
