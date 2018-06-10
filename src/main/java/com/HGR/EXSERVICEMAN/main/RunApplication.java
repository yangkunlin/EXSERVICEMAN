package com.HGR.EXSERVICEMAN.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author:  yangkunlin
 * Date:    2018/6/10
 * Domain:  pla.hc10
 */
@SpringBootApplication(scanBasePackages = "com.hoping.EXSERVICEMAN.controller")
public class RunApplication {

    public static void main(String[] args) {

        SpringApplication.run(RunApplication.class, args);

    }

}
