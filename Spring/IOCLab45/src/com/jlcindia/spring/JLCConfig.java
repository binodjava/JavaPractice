package com.jlcindia.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = { "com.jlcindia.spring" })
public class JLCConfig {

	@Bean(name = "jlc")
	public JLCManager getManager() {
		return new JLCManager();
	}

}
