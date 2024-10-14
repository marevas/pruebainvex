package com.example.invex;

import org.apache.logging.log4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PruebaApplication {
private static final Logger logger = LogManager.getLogger(PruebaApplication.class.getName());
	public static void main(String[] args) {
		logger.debug("this is a DEBUG message");
		logger.info("this is a INFO message");
		logger.warn("this is a WARN message");
		logger.error("this is a ERROR message");
		logger.fatal("this is a FATAL message");
		SpringApplication.run(PruebaApplication.class, args);
	}

}
