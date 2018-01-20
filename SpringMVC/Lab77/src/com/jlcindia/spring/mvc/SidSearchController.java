package com.jlcindia.spring.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("sidSearchCommand")
public class SidSearchController {
	@Autowired
	private SidValidator SidValidator;

	public String searchStudent(
			@ModelAttribute("sidSearchCommand") SidSearchCommand sidCommand,
			BindingResult errors, Model model, HttpServletRequest req)
			throws ServletException {
		String result = "sidsearch";
		System.out.println("SearchStudent");
		SidValidator.validate(sidCommand, errors);
		if (errors.hasErrors()) {
			System.out.println(errors.getErrorCount());
			return result;
		}
		String sid = sidCommand.getSid();
		System.out.println(sid);
		if (sid.equals("JLC-123") || sid.equals("JLC-999")) {
			StudentTO sto = new StudentTO();
			sto.setSid(sid);
			sto.setBid("B-99");
			sto.setName("Srinivas");
			sto.setEmail("sri@jlc.com");
			sto.setPhone("99999");
			model.addAttribute("STO", sto);
			result = "sidresults";
		} else {
			req.setAttribute("sidSearchCommand", sidCommand);
			StudentNotFoundException exc = new StudentNotFoundException(sid);
			req.setAttribute("msg", exc.getMessage());
			throw exc;
		}
		return result;

	}

	// Defining Command Object
	@ModelAttribute("sidSearchCommand")
	public SidSearchCommand createSidCommand() {
		return new SidSearchCommand();
	}

	@RequestMapping(value="/sidsearch")
	protected String showSearchPage() throws ServletException {
		return "sidsearch";
	}

}
