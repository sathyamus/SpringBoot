package com.snsystems.SpringBootBasic.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.snsystems.SpringBootBasic.component.LegacyMessage;

@Configuration
public class ExternalConfiguration {
	
	@Value("${dispMessage}")
	private String displayMessage;
	
	@Value("${loginMessage}")
	private String loginMessage;
	

	@Bean
	public LegacyMessage createLegacyMessage() {
		LegacyMessage lm = new LegacyMessage();
		lm.setDisplayMessage(displayMessage);
		lm.setLoginMessage(loginMessage);
		//lm.setDisplayMessage("message from ExternalConfiguration: createLegacyMessage");
		return lm;
	}
	

}
