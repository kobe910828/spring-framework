package com.hx.controller;

import com.hx.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ITestService testService;



    @RequestMapping("/add")
    public void add(String name){

        testService.add(name);
    }

    @RequestMapping("/query")
    public void query(String name, String age){

        testService.query(name, age);
    }

}
