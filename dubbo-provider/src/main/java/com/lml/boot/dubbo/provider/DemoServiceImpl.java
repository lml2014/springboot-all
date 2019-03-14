package com.lml.boot.dubbo.provider;

import com.lml.boot.dubbo.interfaces.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
