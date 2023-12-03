package com.myxh.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author MYXH
 * @date 2023/12/2
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    public RestTemplate getRestTemplate()
    {
        // xml 配置：applicationContext.xml <bean id="" class=""/>
        return new RestTemplate();
    }
}
