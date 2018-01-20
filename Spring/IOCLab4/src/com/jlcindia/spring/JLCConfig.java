package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JLCConfig {

	
	@Bean
	@Scope("prototype")
	public Hello hello() {
		return new Hello();
	}

}
