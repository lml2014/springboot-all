package com.lml.boot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lml.boot.dubbo.interfaces.DemoService;
import org.springframework.stereotype.Component;

@Component
public class AnnotationAction {

    @Reference
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }
}
