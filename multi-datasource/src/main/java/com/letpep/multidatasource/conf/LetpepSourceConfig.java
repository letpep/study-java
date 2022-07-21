package com.letpep.multidatasource.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@MapperScan(basePackages = "com.letpep.multidatasource.dao.letpep", sqlSessionFactoryRef = "letpepSqlSessionFactory")
@Configuration
public class LetpepSourceConfig {


    @Primary
    @Bean("letpepDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.letpep")
    public DataSource getLetpapDataSource(){
        return DataSourceBuilder.create().build();
    }
    @Primary
    @Bean("letpepSqlSessionFactory")
    public SqlSessionFactory letpepSqlSessionFactory(@Qualifier("letpepDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/letpep/*.xml"));
        return bean.getObject();
    }



    @Primary
    @Bean("letpepSqlSessionTemplate")
    public SqlSessionTemplate letpepSqlSessionTemplate(@Qualifier("letpepSqlSessionFactory")SqlSessionFactory sqlSessionFactory){

        return new SqlSessionTemplate(sqlSessionFactory);

    }


}
