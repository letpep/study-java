package com.letpep.nacos2db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserControllerJdbc {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/dbgetusers")
    public List<Map<String,Object>> userList(){
        String sql = "select * from users";
        List<Map<String,Object>> users = jdbcTemplate.queryForList(sql);
        return users;
    }

}
