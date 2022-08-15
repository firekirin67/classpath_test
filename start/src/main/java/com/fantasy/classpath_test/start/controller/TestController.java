package com.fantasy.classpath_test.start.controller;


import com.fantasy.classpath_test.business.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;


    @RequestMapping("test")
    public Integer test() {

        return testService.select();
    }
}
