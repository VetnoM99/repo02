package com.example;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class MyFirstApoRestApplication {

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MyFirstApoRestApplication.class);
			
			public static void main(String[] args) {
		SpringApplication.run(MyFirstApoRestApplication.class, args);
		
		LOGGER.info("Info Mesagge");
		LOGGER.warn("WARNING mesage");
		LOGGER.error("ERROR MESSAGE");
		LOGGER.debug("DEBUG MESSAGE");
		LOGGER.trace("TRACE MESSAGE");
		
	}

}