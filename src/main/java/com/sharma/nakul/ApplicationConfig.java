package com.sharma.nakul;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    @Primary
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("Nakul","Sharma");
    }

    @Bean
    @Qualifier("second")
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("Rahul","Sharma");
    }

    @Bean("third")
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("Param","Sharma");
    }

}
