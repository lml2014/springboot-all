package com.lml.boot.dubbo.consumer;

import com.lml.boot.dubbo.interfaces.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        System.out.println("----Dubbo Consumer Init-----");
        ConsumerConfig consumerConfig = (ConsumerConfig) context.getBean("consumerConfig"); // 获取远程服务代理
        DemoService demoService = consumerConfig.getDemoServiceConfig();
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println(hello); // 显示调用结果
        System.in.read();
    }
}
