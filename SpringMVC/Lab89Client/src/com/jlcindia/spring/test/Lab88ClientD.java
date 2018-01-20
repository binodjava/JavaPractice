package com.jlcindia.spring.test;

import org.springframework.web.client.RestTemplate;

public class Lab88ClientD {
	public static void main(String[] args) {
		RestTemplate rTemp = new RestTemplate();
		System.out.println("\nDelete Contact By Id");
		rTemp.delete("http://localhost:8080/Lab88/rest/contacts/2");
		System.out.println("---Done---");

	}

}
