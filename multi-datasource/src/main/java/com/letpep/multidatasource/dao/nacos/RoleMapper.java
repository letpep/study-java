package com.letpep.multidatasource.dao.nacos;

import com.letpep.multidatasource.model.Role;
import com.letpep.multidatasource.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface RoleMapper {
            List<Role> getroles ();
    }
