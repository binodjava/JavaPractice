package com.jlcindia.spring.test;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.jlcindia.Contact;

public class Lab88ClientB {
	public static void main(String[] args) {
		RestTemplate rTemp = new RestTemplate();
		System.out.println("\nAll Contact");
		List<Contact> list = rTemp.getForObject("http://localhost:8080/Lab88/rest/contacts/", List.class);
		System.out.println(list);
		System.out.println("---Done---");

	}

}
