package com.HGR.EXSERVICEMAN.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

/**
 * Author:  yangkunlin
 * Date:    2018/6/10
 * Domain:  pla.hc10
 */
@SpringBootApplication(scanBasePackages = "com.HGR.EXSERVICEMAN.controller")
@MapperScan("com.HGR.EXSERVICEMAN.mybatis.dao")
public class RunApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(RunApplication.class, args);
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource.getClass());

    }

}
