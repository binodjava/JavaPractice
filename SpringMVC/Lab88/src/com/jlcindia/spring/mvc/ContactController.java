package com.jlcindia.spring.mvc;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jlcindia.Contact;

@Controller
@RequestMapping("/contacts")
public class ContactController {
	List<Contact> list = new ArrayList<Contact>();
	static int cid = 0;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody
	List<Contact> getAllContacts() {
		System.out.println("***getAllContacts***");
		return list;
	}

	@RequestMapping(value = { "/{cid}" }, method = RequestMethod.GET, produces = { "application/json"})
	public @ResponseBody
	Contact getContactById(@PathVariable int cid) {
		System.out.println("***getContactById***");
		for (Contact con : list) {
			if (cid == con.getCid())
				return con;
		}
		return null;
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public @ResponseBody
	boolean addContact(@RequestBody Contact con) {
		cid++;
		System.out.println("**addContact**");
		con.setCid(cid);
		return list.add(con);
	}

	@RequestMapping(value = { "/{cid}" }, method = RequestMethod.DELETE)
	public @ResponseBody
	boolean deleteContactById(@PathVariable int cid) {
		System.out.println("**deleteContactById**");

		Iterator<Contact> it = list.iterator();
		while (it.hasNext()) {
			Contact con = it.next();
			if (con.getCid() == cid)
				it.remove();
		}
		return false;
	}

}