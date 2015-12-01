package com.williewheeler.demos.spring.configurable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class UnmanagedBean {
	private static final Logger log = LoggerFactory.getLogger(UnmanagedBean.class);
	
	@Autowired private DemoService demoService;
	
	public void displayDependency() {
		log.info("demoService={}", demoService);
	}
}
