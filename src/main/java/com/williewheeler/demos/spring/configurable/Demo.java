package com.williewheeler.demos.spring.configurable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication
@EnableSpringConfigured
@EnableLoadTimeWeaving
public class Demo {
	
	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
		new UnmanagedBean().displayDependency();
	}
}
