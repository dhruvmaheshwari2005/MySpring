package com.dhruv.MySpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class Billa implements Animal {
    @Override
    public void eat() {
        System.out.println("I don't eat I drink milk");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep 6 hours");
    }

    @Override
    public void walk() {
        System.out.println("I don't walk I run");
    }
}
