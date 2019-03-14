package com.lml.boot.dubbo.provider;

import com.lml.boot.dubbo.interfaces.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
