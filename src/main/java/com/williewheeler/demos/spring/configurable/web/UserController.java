package com.williewheeler.demos.spring.configurable.web;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.williewheeler.demos.spring.configurable.entity.User2;
import com.williewheeler.demos.spring.configurable.service.UserService;

// FIXME Hm, when this class exists, the user's UserService dependency goes null.
// It's because having the User class in the route causes us to load the User class before instantiating the load time
// weaver, and so we never end up weaving User to inject the dependencies. [WLW]

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	@Autowired private UserService userService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public User2 postUser(@RequestBody User2 user) {
		log.info("userService={}", userService);
		log.info("user={}", user);
		return user;
//		new User().save();
//		return null;
	}
}
