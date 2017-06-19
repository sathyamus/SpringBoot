package com.snsystems.SpringBootBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicApplication {

	public static void main(String[] args) {
		
		// args - will be used to pass external data
		// profiler info
		
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
}
