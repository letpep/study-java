package com.letpep.common.dao;

import com.letpep.common.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> getUsers ();
}
