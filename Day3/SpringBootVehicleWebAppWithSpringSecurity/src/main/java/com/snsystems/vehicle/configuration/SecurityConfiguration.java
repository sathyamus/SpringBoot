package com.snsystems.vehicle.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	// Authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication()
		.withUser("user")
		.password("secret")
		.roles("USER", "ADMIN");
	}

	
	// Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// authorization rules
			
		
		http.antMatcher("/**").authorizeRequests()
		.anyRequest()
		.hasRole("USER")
		.and()
		.formLogin()
		.loginPage("/login.jsp")
		.failureUrl("/login.jsp?error=1")
		.loginProcessingUrl("/login")
		.defaultSuccessUrl("/website/vehicle/list.html")
		.permitAll()
		.and()
		.logout()
		.logoutUrl("/logout")
		.logoutSuccessUrl("/login.jsp")
		.invalidateHttpSession(true);
		//.logoutSuccessUrl("/login.jsp");
	}

}
