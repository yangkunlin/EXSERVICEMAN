package com.HGR.EXSERVICEMAN.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Description:
 *
 * @author YKL on 2018/6/14.
 * @version 1.0
 * spark:梦想开始的地方
 */
@Configuration
public class DataSourceConfigurer {
    @Primary
    @Bean(initMethod = "init")
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
