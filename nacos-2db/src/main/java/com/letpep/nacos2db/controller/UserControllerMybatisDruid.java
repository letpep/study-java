package com.letpep.nacos2db.controller;

import com.letpep.nacos2db.dao.UserMapper;
import com.letpep.nacos2db.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerMybatisDruid {
    @Autowired
    private UserMapper userMapper ;
    @GetMapping("/getUsers")
    public List<User> getUsers(){
      return  userMapper.getUsers();
    }
}
