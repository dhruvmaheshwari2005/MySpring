package com.dhruv.MySpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Doggy implements Animal {

    @Override
    public void eat() {
        System.out.println("I will eat Roti");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep 18 hours in a day");
    }

    @Override
    public void walk() {
        System.out.println("I don't usually walk");
    }
}
