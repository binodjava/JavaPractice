package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JlcConfig {

	@Bean
	public Student student() {
		Student st = new Student();
		st.setName("Sri");
		return st;
	}

}
