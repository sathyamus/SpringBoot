package com.snsystems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer // added
@EnableResourceServer
@RestController
public class SpringBootOAuthAppApplication {

	
	@RequestMapping("/resource/endpoint")
	public String endpoint() {
		return "this resource is protected by the resource server";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOAuthAppApplication.class, args);
	}
}
