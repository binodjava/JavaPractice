package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {

	@Bean
	public A aobj() {
		A aobj = new A();
		aobj.setA(10);
		aobj.setMsg("AAA");
		return aobj;
	}

	@Bean
	public Hello hello() {
		return new Hello();
	}

	public B bo() {
		return new B(20, "BBB");
	}

}
