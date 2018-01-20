package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return User.class.equals(clazz);
	}

	
	public void validate(Object command, Errors errors) {
		User user = (User) command;
		if (user.getUsername() == null || user.getUsername().length() == 0) {
			errors.rejectValue("username", "errors.username.required.", null,
					"Username required");

		}
		if (user.getPassword() == null || user.getPassword().length() == 0) {
			errors.rejectValue("password", "errors.password.required", null,
					"Password required.");
		}

	}

}
