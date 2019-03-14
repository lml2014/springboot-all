package com.lml.boot.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.lml.boot.dubbo.provider")
@PropertySource("classpath:/dubbo-provider.properties")
public class ProviderConfig {

}
