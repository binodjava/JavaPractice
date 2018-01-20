package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HaiConfig {

	@Bean(name = "hai")
	public Hai getHai() {
		return new Hai();
	}

}
