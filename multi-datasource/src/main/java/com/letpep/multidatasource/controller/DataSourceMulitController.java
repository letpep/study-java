package com.letpep.multidatasource.controller;

import com.letpep.multidatasource.dao.letpep.UserMapper;
import com.letpep.multidatasource.dao.nacos.RoleMapper;
import com.letpep.multidatasource.model.Role;
import com.letpep.multidatasource.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DataSourceMulitController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return  userMapper.getUsers();
    }

    @GetMapping("/getRoles")
    public List<Role> getRoles(){
        return  roleMapper.getroles();
    }

}
