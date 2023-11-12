package com.example.hallaq2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Hallaq2 {
	public static void main(String[] args) {
		ApplicationContext thisApp = SpringApplication.run(Hallaq2.class, args);
		mainclass ahmad = thisApp.getBean(mainclass.class);  // :)

	}

}
