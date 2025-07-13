package com.cognizant.Country_Web_Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryWebServicesApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CountryWebServicesApplication.class);
	public static void main(String[] args) {
		LOGGER.info("START: CountryWebServicesApplication");
		SpringApplication.run(CountryWebServicesApplication.class, args);
		LOGGER.info("END: CountryWebServicesApplication");
	}
}
