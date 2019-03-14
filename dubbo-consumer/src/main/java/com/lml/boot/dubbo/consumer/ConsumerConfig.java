package com.lml.boot.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.lml.boot.dubbo.consumer")
@PropertySource("classpath:/dubbo-consumer.properties")
public class ConsumerConfig {
}
