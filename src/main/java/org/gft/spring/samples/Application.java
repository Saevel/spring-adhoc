package org.gft.spring.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean("beanA1")
    public BeanA beanA1(){
        return new BeanA();
    }

    @Bean("beanA2")
    public BeanA beanA2(){
        return new BeanA();
    }
}
