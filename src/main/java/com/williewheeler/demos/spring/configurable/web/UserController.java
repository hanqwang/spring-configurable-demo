package com.williewheeler.demos.spring.configurable.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.williewheeler.demos.spring.configurable.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public User postUser(@RequestBody User user) {
		log.info("user={}", user);
		return user;
	}
}
