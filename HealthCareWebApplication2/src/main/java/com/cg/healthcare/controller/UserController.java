package com.cg.healthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.exception.UserException;
import com.cg.healthcare.repository.UserRepository;
import com.cg.healthcare.service.IUserService;
import com.cg.healthcare.util.HealthCareValidation;
import static com.cg.healthcare.constants.UserConstants.*;

import java.util.List;

/**
 * UserController is a class to handle user requests
 * 
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @date 11/11/2020
 *
 */

@RestController
@RequestMapping("/healthCare/user")
public class UserController {

	@Autowired
	private HealthCareValidation healthCareValidation;

	@Autowired
	private IUserService userService;
	@Autowired
	private UserRepository dao;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	/**
	 * validateUser method validates user
	 * 
	 * @method validateUser()
	 * @param user {@ link as User}
	 * @objective method to validate user
	 * @return User
	 */
	@PostMapping("/validateUser")
	public ResponseEntity<User> validateUser(@ModelAttribute(value = "username") String username,
			@ModelAttribute(value = "password") String password) {
		try {
			healthCareValidation.validateObject(username);
			return new ResponseEntity<User>(userService.validateUser(username, password), HttpStatus.OK);
		} catch (UserException exception) {
			LOGGER.error(VALIDATE_USER_ERROR, username, exception);
			return new ResponseEntity<User>(userService.validateUser(username, password),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * addUser method adds user
	 * 
	 * @method addUser()
	 * @param user {@ link as User}
	 * @objective method to add user
	 * @return User
	 */

	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		try {
			healthCareValidation.validateObject(user);
			return new ResponseEntity<User>(userService.addUser(user), HttpStatus.OK);
		} catch (UserException exception) {
			LOGGER.error(ADD_USER_ERROR, user.toString(), exception);
			return new ResponseEntity<User>(userService.addUser(user), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * removeUser method removes user
	 * 
	 * @method removeUser()
	 * @param user {@ link as User}
	 * @objective method to remove user
	 * @return User
	 */

	@DeleteMapping("/removeUser")
	public ResponseEntity<List<User>> removeUser(@RequestBody User user) {
		try {
			healthCareValidation.validateObject(user);
			userService.removeUser(user);
			return new ResponseEntity<List<User>>(dao.findAll(), HttpStatus.OK);
		} catch (UserException exception) {
			LOGGER.error(REMOVE_USER_ERROR, user.getUsername(), exception);
			return new ResponseEntity<List<User>>((List<User>) userService.removeUser(user), HttpStatus.NOT_FOUND);
		}
	}

}
