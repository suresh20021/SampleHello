package com.durgasoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleHelloApplication.class, args);
		System.out.println("******Welcome to Spring Boot Sample Application*****");
		System.out.println("******This is my First Push*****");
	}

}
