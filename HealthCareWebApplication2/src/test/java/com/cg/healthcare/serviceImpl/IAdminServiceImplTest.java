package com.cg.healthcare.serviceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
import com.cg.healthcare.repository.IAdminRepository;
import com.cg.healthcare.repository.UserRepository;
import com.cg.healthcare.service.IUserService;

/**
 * The IAdminServiceImplTest program is used for testing admin related
 * operations.
 *
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @since 11/11/2020
 */

@RunWith(MockitoJUnitRunner.class)
public class IAdminServiceImplTest {

	@Mock
	private IAdminRepository adminRepo;
	@InjectMocks
	private IAdminServiceImpl adminServiceImpl;

	// Method to check the valid input for registerAdmin
	@Test
	public void testRegisterAdmin() {

		User inputUserObj = new User();
		inputUserObj.setUsername("Aman");
		inputUserObj.setPassword("Aman@");

		// Mockito.when(adminRepo.save(inputUserObj)).thenReturn(inputUserObj);

		User returnedUserObj = adminServiceImpl.registerAdmin(inputUserObj.getUsername(), inputUserObj.getPassword());

		assertEquals(inputUserObj.getUsername(), returnedUserObj.getUsername());
	}

	// Method to check the invalid input for registerAdmin
	@Test(expected = Exception.class)
	public void testRegisterAdminException() throws Exception {

		when(adminRepo.save(Mockito.anyObject())).thenThrow(new Exception());
		String username = "";
		String password = "";
		adminServiceImpl.registerAdmin(username, password);
	}

}
