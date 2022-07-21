package com.letpep.multidatasource.dao.letpep;

import com.letpep.multidatasource.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> getUsers ();
}
