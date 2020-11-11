package com.cg.healthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.exception.UserException;
import com.cg.healthcare.service.IAdminService;
import com.cg.healthcare.service.IUserService;
import com.cg.healthcare.util.HealthCareValidation;
import static com.cg.healthcare.constants.UserConstants.*;

/**
 * AdminController is a class to handle admin requests
 * 
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @date 11/11/2020
 *
 */

@RestController
@RequestMapping("/healthCare/admin")
public class AdminController {

	@Autowired
	private HealthCareValidation healthCareValidation;

	@Autowired
	private IAdminService adminService;

	private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);

	/**
	 * registerAdmin method registers admin
	 * 
	 * @method registerAdmin()
	 * @param username,password {@ link as User}
	 * @objective method to register admin
	 * @return User
	 */

	@PostMapping("/registerAdmin")
	public ResponseEntity<User> registerAdmin(@ModelAttribute(value = "username") String username,
			@ModelAttribute(value = "password") String password) {
		try {
			healthCareValidation.validateObject(username);
			return new ResponseEntity<User>(adminService.registerAdmin(username, password), HttpStatus.OK);
		} catch (UserException exception) {
			LOGGER.error(REGISTER_ADMIN_ERROR, username, exception);
			return new ResponseEntity<User>(adminService.registerAdmin(username, password),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
