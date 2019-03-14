package com.lml.boot.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lml.boot.dubbo.interfaces.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
