package com.williewheeler.demos.spring.configurable.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.williewheeler.demos.spring.configurable.service.UserService;

@Configurable
@JsonPropertyOrder
public class User {
	private static Logger log = LoggerFactory.getLogger(User.class);
	
	@Autowired
	@JsonIgnore
	private UserService userService;
	
	public void displayDependencies() {
		log.info("userService={}", userService);
	}
}
