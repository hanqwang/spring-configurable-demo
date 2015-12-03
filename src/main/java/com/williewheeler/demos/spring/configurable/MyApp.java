package com.williewheeler.demos.spring.configurable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import com.williewheeler.demos.spring.configurable.entity.User;

@SpringBootApplication
@EnableSpringConfigured
public class MyApp {
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
		new User().displayDependencies();
	}
}
