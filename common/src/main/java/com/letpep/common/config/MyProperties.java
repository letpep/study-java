package com.letpep.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "letpep")
@Data
@Component
public class MyProperties {
    private String name;
}
