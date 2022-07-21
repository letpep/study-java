package com.letpep.nacos2db.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int  id;
    private String name ;
    private int age;
}
