package com.education.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.education.springDemo")
public class IocConfig {

    @Bean
    public ICustomerDal database(){
        return new MsSqlCustomerDal();
    }
}
