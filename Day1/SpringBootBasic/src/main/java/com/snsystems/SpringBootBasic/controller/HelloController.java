package com.snsystems.SpringBootBasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.snsystems.SpringBootBasic.component.LegacyMessage;
import com.snsystems.SpringBootBasic.component.Message;

//Spring uses HttpMessageConverters to render @ResponseBody (or responses from @RestController).

// @RestController = @Controller + @ResponseBody

@RestController // expose this class a REST Web service
public class HelloController {

	// to inject the message bean
	@Autowired
	private Message message;

	@Autowired
	private LegacyMessage legacyMessage;
	
	
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
	
	
	@RequestMapping("/legacy/{name}")
	@ResponseBody()
	public String legacy(@PathVariable("name") String name) {
		legacyMessage.setDisplayMessage("Welcome "+ name);
		return legacyMessage.getDisplayMessage();
	}
	
	@RequestMapping("/displayMessage")
	@ResponseBody()
	public String displayMessage() {
		return legacyMessage.getDisplayMessage();
	}
	
	
	@RequestMapping("/loginMessage")
	@ResponseBody()
	public String loginMessage() {
		return legacyMessage.getLoginMessage();
	}	
	
	
	@RequestMapping("/errorMessage")
	@ResponseBody()
	public String errorMessage() {
		return message.getErrorMessage();
	}
}
