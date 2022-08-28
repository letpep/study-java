package com.letpep.common.springboot;

import com.letpep.common.model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Person.class)
public class SpringBootConfig {
}
