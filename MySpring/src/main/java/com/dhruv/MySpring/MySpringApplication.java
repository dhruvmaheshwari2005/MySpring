package com.dhruv.MySpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(MySpringApplication.class, args);

		Example e = context.getBean(Example.class);
		e.doNothing(context);
	}

}
