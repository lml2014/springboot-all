package com.lml.boot.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        System.out.println("----Dubbo Consumer Init-----");
        AnnotationAction action = context.getBean(AnnotationAction.class);
        String hello = action.doSayHello("world"); // 执行远程方法
        System.out.println(hello); // 显示调用结果
        System.in.read();
    }
}
