package com.poc.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleRestApiSbApplication {

//	public static void main(String[] args) {
//		//SpringApplication.run(SampleRestApiSbApplication.class, args);
//		try (ConfigurableApplicationContext context = SpringApplication.run(SampleRestApiSbApplication.class, args)) {
//			System.out.println("context: " + context);
//		}
//	}
	public static void main(String[] args) {
		SpringApplication.run(SampleRestApiSbApplication.class, args);
	}

}
