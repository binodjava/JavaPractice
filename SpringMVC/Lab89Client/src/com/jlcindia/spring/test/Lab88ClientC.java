package com.jlcindia.spring.test;

import org.springframework.web.client.RestTemplate;

import com.jlcindia.Contact;

public class Lab88ClientC {
	public static void main(String[] args) {
		RestTemplate rTemp = new RestTemplate();
		System.out.println("\nContact By Id");
		Contact con1 = rTemp.getForObject(
				"http://localhost:8080/Lab88/rest/contacts/1", Contact.class);
		System.out.println(con1);
		System.out.println();
		System.out.println("---Done---");

	}

}
