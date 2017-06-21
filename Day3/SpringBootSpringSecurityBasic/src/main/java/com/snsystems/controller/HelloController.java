package com.snsystems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.snsystems.model.Message;

//Spring uses HttpMessageConverters to render @ResponseBody (or responses from @RestController).

// @RestController = @Controller + @ResponseBody

@RestController // expose this class a REST Web service
public class HelloController {

	// to inject the message bean
	@Autowired
	private Message message;

	@RequestMapping("/hello")
	public String hello() {
		return "Welcome to Spring Boot";
	}

	@RequestMapping(path="/hello1")
	public String hello1() {
		return "Welcome to Spring Boot";
	}
	
	@RequestMapping("/greet/{name}")
	@ResponseBody()
	public String greet(@PathVariable("name") String name) {
		message.setDisplayMessage("Welcome "+ name);
		return message.getDisplayMessage();
	}
	
	@RequestMapping("/displayMessage")
	@ResponseBody()
	public String displayMessage() {
		return message.getDisplayMessage();
	}
	
	
	@RequestMapping("/loginMessage")
	@ResponseBody()
	public String loginMessage() {
		return message.getLoginMessage();
	}	
	
	
	@RequestMapping("/errorMessage")
	@ResponseBody()
	public String errorMessage() {
		return message.getErrorMessage();
	}
}
