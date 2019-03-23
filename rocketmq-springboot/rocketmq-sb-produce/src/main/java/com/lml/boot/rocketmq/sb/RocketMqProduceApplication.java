package com.lml.boot.rocketmq.sb;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootApplication
public class RocketMqProduceApplication implements CommandLineRunner {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RocketMqProduceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        rocketMQTemplate.convertAndSend("test-topic-1", "Hello World!");
        rocketMQTemplate.send("test-topic-1", MessageBuilder.withPayload("Hello, World! I am Produce.").build());
        rocketMQTemplate.convertAndSend("test-topic-2", new OrderPaidEvent("T_001", new BigDecimal("88.00")));
    }


}
