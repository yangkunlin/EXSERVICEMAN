package com.HGR.EXSERVICEMAN.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:  yangkunlin
 * Date:    2018/6/10
 * Domain:  pla.hc10
 */
@RestController
public class TestController {

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String getResult(@RequestBody String body) throws Exception {
        return "test";
    }

}
