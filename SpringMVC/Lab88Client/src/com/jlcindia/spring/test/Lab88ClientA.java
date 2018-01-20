package com.jlcindia.spring.test;

import org.springframework.web.client.RestTemplate;

import com.jlcindia.Contact;

public class Lab88ClientA {
	public static void main(String[] args) {
		RestTemplate rTemp = new RestTemplate();
		Contact con = new Contact();
		con.setName("Srinivas");
		con.setEmail("srinivas@gmail.com");
		con.setPhone(99999L);
		
		boolean res = rTemp.postForObject(
				"http://localhost:8080/Lab88/rest/contacts/", con,
				Boolean.class);
		System.out.println(res);
		if (res) {
			System.out.println("\nContact added successfully");
		} else {
			System.out.println("\nError in adding Contact");
		}
		System.out.println("---Done---");
	}

}
