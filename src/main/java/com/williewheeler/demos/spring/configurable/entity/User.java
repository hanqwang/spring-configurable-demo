package com.williewheeler.demos.spring.configurable.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.williewheeler.demos.spring.configurable.service.UserService;

@Data
@Configurable
@Slf4j
@JsonPropertyOrder
public class User {
	
	@Autowired
	@JsonIgnore
	private UserService userService;
	
//	public void save() {
//		userService.save(this);
//	}
	
	public void displayDependencies() {
		log.info("userService={}", userService);
	}
}
