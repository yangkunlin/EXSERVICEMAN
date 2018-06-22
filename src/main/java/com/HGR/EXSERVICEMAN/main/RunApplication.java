package com.HGR.EXSERVICEMAN.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

/**
 * Author:  yangkunlin
 * Date:    2018/6/10
 * Domain:  pla.hc10
 */
@SpringBootApplication(scanBasePackages = "com.HGR.EXSERVICEMAN.controller")
public class RunApplication {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(RunApplication.class, args);

        new Test().test();

    }

}
