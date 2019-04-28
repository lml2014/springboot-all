package com.lml.boot.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -Djava.net.preferIPv4Stack=true
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("-----Dubbo Init-----");
        // 按任意键退出
        System.in.read();
    }
}
