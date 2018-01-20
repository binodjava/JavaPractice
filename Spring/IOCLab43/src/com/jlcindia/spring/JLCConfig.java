package com.jlcindia.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Configuration
public class JLCConfig {
	@Bean
	public Student student() {
		Student stu = new Student();
		stu.setSname("Binod");
		stu.setPhone(12345);
		return stu;
	}

	@Bean(name="sid")
	public String studentId() {
		return "B99-101";

	}

	@Bean
	public String fee() {
		return "10000,5000,5000";
	}

	@Bean
	public String emails() {
		return "aa@jlc.com,bb@jlc.com,cc@jlc.com,dd@jlc.com";

	}

	@Bean
	public List<Long> phones() {
		List<Long> phones = new ArrayList<Long>();
		phones.add(1111L);
		phones.add(2222L);
		phones.add(3333L);
		phones.add(4444L);
		return phones;
	}

	@InitBinder
	public void initBinderAll(WebDataBinder binder) {
		binder.registerCustomEditor(List.class, new ListEditor());
		binder.registerCustomEditor(Fee.class, new FeeEditor());
		binder.registerCustomEditor(StudentID.class, new StudentIDEditor());
	}

}           
