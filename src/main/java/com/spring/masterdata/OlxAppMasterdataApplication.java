package com.spring.masterdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OlxAppMasterdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxAppMasterdataApplication.class, args);
	}

}
