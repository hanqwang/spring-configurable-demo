package com.williewheeler.demos.spring.configurable.service.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.williewheeler.demos.spring.configurable.service.UserService;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

	// FIXME This is what makes the difference between the injection working and not.
	// When I comment this out it works. Bizarre. I suspect that it's because we create a proxy when the method
	// exists, and the proxy is created too late to be injected into the user... [WLW]
//	@Override
//	public void save(User user) {
//		log.info("Saving user: {}", user);
//		// Etc.
//	}
}
