package com.hx.service.impl;

import com.hx.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {

    @Override
    public void add(String name) {
        System.out.println("新增了" + name);
    }

    @Override
    public void query(String name, String age) {
        System.out.println(name + "的年龄是" + age);
    }
}
