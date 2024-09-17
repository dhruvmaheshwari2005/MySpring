package com.dhruv.MySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Example {
    @Autowired
    Animal animal;


    public void  doNothing(ApplicationContext context) {
        animal.walk();
    }
}
