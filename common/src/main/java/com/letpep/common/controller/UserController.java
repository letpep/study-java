package com.letpep.common.controller;

import com.letpep.common.dao.UserMapper;
import com.letpep.common.java8.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @RequestMapping("getusers")
    public  List<User> getusers(){

        List<User> users = userMapper.getUsers();
        return users;
    }
}
