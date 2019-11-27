package org.gft.spring.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanB {

    @Autowired
    @Qualifier("beanA1")
    private BeanA beanA1;

    @Autowired
    @Qualifier("beanA2")
    private BeanA beanA2;

    @PostConstruct
    public void init(){
        beanA1.doA();
        beanA2.doA();
        System.out.println("Bean A1 & A2 Wired!");
    }

}
