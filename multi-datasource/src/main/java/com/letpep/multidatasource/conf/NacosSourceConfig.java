package com.letpep.multidatasource.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@MapperScan(basePackages = "com.letpep.multidatasource.dao.nacos", sqlSessionFactoryRef = "nacosSqlSessionFactory")
@Configuration
public class NacosSourceConfig {



    @Bean("nacospDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.nacos")
    public DataSource getLetpapDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("nacosSqlSessionFactory")
    public SqlSessionFactory letpepSqlSessionFactory(@Qualifier("nacospDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/nacos/*.xml"));
        return bean.getObject();
    }




    @Bean("nacosSqlSessionTemplate")
    public SqlSessionTemplate letpepSqlSessionTemplate(@Qualifier("nacosSqlSessionFactory")SqlSessionFactory sqlSessionFactory){

        return new SqlSessionTemplate(sqlSessionFactory);

    }


}
