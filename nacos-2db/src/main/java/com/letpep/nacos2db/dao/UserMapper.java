package com.letpep.nacos2db.dao;

import com.letpep.nacos2db.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> getUsers ();
}
