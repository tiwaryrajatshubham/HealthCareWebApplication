/**
* The IAdminServiceImpl is an implementation of IAdminService interface  that
* performs operations related to registration of user.
* 
* @author  Tiwary Rajat Shubham(alias)
* @version 1.0
* @since   11/11/2020
*/
package com.cg.healthcare.serviceImpl;

import static com.cg.healthcare.constants.UserConstants.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.exception.UserException;
import com.cg.healthcare.repository.IAdminRepository;
import com.cg.healthcare.service.IAdminService;

@Component
public class IAdminServiceImpl implements IAdminService {
	@Autowired
	private IAdminRepository dao;

	private static final Logger LOGGER = LoggerFactory.getLogger(IAdminServiceImpl.class);

	/**
	 * registerAdmin method registers admin
	 * 
	 * @method registerAdmin()
	 * @param username,password {@ link as User}
	 * @objective method to register admin
	 * @return User
	 */
	@Override
	public User registerAdmin(String username, String password) throws UserException {

		User userObj = new User();

		userObj.setUsername(username);
		userObj.setPassword(password);
		userObj.setRole("admin");
		try {
			LOGGER.info(REGISTER_ADMIN_INPUT, userObj.toString());
			dao.saveAndFlush(userObj);
			LOGGER.info(REGISTER_ADMIN_SUCCESS, userObj.toString());
			return userObj;

		} catch (UserException exception) {
			throw new UserException(String.format(REGISTER_ADMIN_DAO_ERROR, userObj.toString()), exception);
		}

	}
}