package com.cg.healthcare.serviceImpl;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.exception.UserException;
import com.cg.healthcare.repository.UserRepository;
import com.cg.healthcare.service.IUserService;

/**
 * The IUserServiceImplTest program is used for testing user related
 * operations.
 *
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @since 11/11/2020
 */

@RunWith(MockitoJUnitRunner.class)
public class IUserServiceImplTest {

	@Mock
	private UserRepository userRepo;
	@InjectMocks
	private IUserServiceImpl userServiceImpl;

	// Method to check valid input for validating user
	@Test
	public void testvalidateUser() {

		User userObj = new User(1, "Aman", "Aman@", "admin");
		String username = "Aman";
		String password = "Aman@";

		Mockito.when(userRepo.findByUsernameAndPassword(username, password)).thenReturn(userObj);

		User userObj1 = userServiceImpl.validateUser(username, password);

		assertEquals(userObj1, userObj);
	}

	// Method to check invalid input for validating user
	@Test
	public void testInvalidvalidateUser() {

		// User userObj=new User(1,"Aman","Aman@","admin");
		String username = "aman";
		String password = "Aman@";

		Mockito.when(userRepo.findByUsernameAndPassword(username, password)).thenReturn(null);

		// User userObj1 = userServiceImpl.validateUser("aman", password);
		Exception ex = assertThrows(UserException.class, () -> {
			userServiceImpl.validateUser("aman", "Aman@");
		});
		String exptMessage = "HEALTH_CARE_API: Error occurred while validating user";
		String actualMessage = ex.getMessage();
		assertTrue(actualMessage.contains(exptMessage));
	}

	// Method to check valid input for adding user
	@Test
	public void testaddUser() {

		User userObj = new User(1, "Aman", "Aman@", "admin");

		Mockito.when(userRepo.save(userObj)).thenReturn(userObj);
		User userObj1 = userServiceImpl.addUser(userObj);

		assertEquals(userObj1, userObj);
	}

	// Method to check invalid input for adding user
	@Test(expected = UserException.class)
	public void testaddUserException() throws Exception {
		when(userRepo.save(Mockito.anyObject())).thenThrow(new UserException());
		userServiceImpl.addUser(new User());
	}

	// Method to check valid input for removing user
	@Test
	public void testremoveUser() {

		User userObj = new User(1, "Aman", "Aman@", "admin");

		Mockito.when(userRepo.findByIdAndUsername(userObj.getId(), userObj.getUsername())).thenReturn(userObj);
		User userObj1 = userServiceImpl.removeUser(userObj);

		assertEquals(userObj1, userObj);

	}

	// Method to check invalid input for removing user
	@Test
	public void testInvalidremoveUser() {

		User userObj = new User(1, "Aman", "Aman@", "admin");

		// Mockito.when(userRepo.findByIdAndUsername(userObj.getId(),userObj.getUsername())).thenReturn(userObj);
		// User userObj1 = userServiceImpl.removeUser(userObj);

		Exception ex = assertThrows(UserException.class, () -> {
			userServiceImpl.removeUser(userObj);
		});
		String exptMessage = "HEALTH_CARE_API: Error occurred while removing user";
		String actualMessage = ex.getMessage();
		assertTrue(actualMessage.contains(exptMessage));
	}

}
