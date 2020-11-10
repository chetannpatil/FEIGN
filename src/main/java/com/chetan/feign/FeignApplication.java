package com.chetan.feign;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class FeignApplication {

	private static Logger LOGGER = LogManager.getLogger(FeignApplication.class);
	
	
	public static void main(String[] args) {
		
		LOGGER.info("\n\n FeignApplication - main- \n\n");
		
		
		SpringApplication.run(FeignApplication.class, args);
	}

}
