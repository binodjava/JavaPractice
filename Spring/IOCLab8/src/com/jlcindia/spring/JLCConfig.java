package com.jlcindia.spring;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {
	@Bean
	public List<String> emails() {
		List<String> emails = new ArrayList<String>();
		emails.add("aa@jlc.com");
		emails.add("bb@jlc.com");
		emails.add("cc@jlc.com");
		return emails;
	}

	@Bean
	public Set<Long> phones() {
		Set<Long> phones = new LinkedHashSet<Long>();
		phones.add(11111L);
		phones.add(22222L);
		phones.add(33333L);
		return phones;
	}

	@Bean(name = "refs")
	public Map<String, Long> references() {
		Map<String, Long> refs = new LinkedHashMap<String, Long>();
		refs.put("AA", 11L);
		refs.put("BB", 22L);
		refs.put("CC", 33L);
		return refs;
	}

	@Bean(name="myprops")
	public Properties myProperties() {
		Properties prop = new Properties();
		prop.put("AA", 11);
		prop.put("BB", 22);
		prop.put("CC", 33);
		return prop;
	}

	@Bean
	public Address address() {
		return new Address("Bangalore", "Mathikere", "KA");
	}

	@Bean
	public Account account1() {
		Account acc1 = new Account();
		acc1.setAccno(11);
		acc1.setAtype("SA");
		acc1.setBal(10000.00);
		return acc1;
	}

	@Bean(name = "accounts")
	public List<Account> accounts() {
		List<Account> accounts = new ArrayList<Account>();
		Account acc2 = new Account();
		acc2.setAccno(12);
		acc2.setAtype("FD");
		acc2.setBal(20000.00);

		accounts.add(account1());
		accounts.add(acc2);
		return accounts;

	}

	@Bean(name="cust")
	public Customer customer(Address add) {
		Customer cust = new Customer(101, "sri", "sri@jlc.com", 9999L);
		cust.setAddress(add);
		return cust;
	}

}
