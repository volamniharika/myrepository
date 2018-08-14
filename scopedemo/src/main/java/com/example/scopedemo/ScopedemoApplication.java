package com.example.scopedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopedemoApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context=SpringApplication.run(ScopedemoApplication.class, args);
		A a=context.getBean(A.class);
		a.setName("jeevan");
		A b=context.getBean(A.class);     //A is a singleton class
		b.setName("niha");
		System.out.println(a.getName());
		System.out.println(b.getName());
		B ba=context.getBean(B.class);   //B is prototype class
		ba.setValue("hello");
		B ab=context.getBean(B.class);
		ab.setValue("hai");
		System.out.println(ba.getValue());
		System.out.println(ab.getValue());
	}
}
