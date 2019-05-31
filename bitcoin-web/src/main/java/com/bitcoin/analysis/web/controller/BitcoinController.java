package com.bitcoin.analysis.web.controller;

import com.bitcoin.analysis.vo.User;
import com.bitcoin.analysis.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhaododo
 **/

@RestController
public class BitcoinController {

    @Resource
    private UserService userService;

    @RequestMapping("/save")
    public String save(@RequestBody User user) {
        userService.save(user);
        return "true";
    }
}
