/**
* The IUserServiceImpl program is an implementation of UserService interface that
* performs user related operations.
*
* @author  Tiwary Rajat Shubham
* @version 1.0
* @since   11/11/2020
*/

package com.cg.healthcare.serviceImpl;

import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.healthcare.repository.UserRepository;
import com.cg.healthcare.service.IUserService;
import static com.cg.healthcare.constants.UserConstants.ADD_USER_INPUT;
import static com.cg.healthcare.constants.UserConstants.ADD_USER_SUCCESS;
import static com.cg.healthcare.constants.UserConstants.ADD_USER_DAO_ERROR;
import static com.cg.healthcare.constants.UserConstants.*;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.exception.UserException;

@Component
public class IUserServiceImpl implements IUserService {
	@Autowired
	private UserRepository dao;
	private static final Logger LOGGER = LoggerFactory.getLogger(IUserServiceImpl.class);

	/**
	 * validateUser method validates user
	 * 
	 * @method validateUser()
	 * @param user {@ link as User}
	 * @objective method to validate user
	 * @return User
	 */
	@Override
	public User validateUser(String username, String password) throws UserException {
		try {
			LOGGER.info(VALIDATE_USER_INPUT, username);
			User userObj = dao.findByUsernameAndPassword(username, password);
			if (userObj != null) {
				LOGGER.info(VALIDATE_USER_SUCCESS, userObj.getUsername());

			} else
				throw new UserException(String.format(VALIDATE_USER_DAO_ERROR, username));
			return userObj;
		} catch (UserException exception) {
			throw new UserException(String.format(VALIDATE_USER_DAO_ERROR, username));
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
	@Override
	public User addUser(User user) throws UserException {
		try {
			LOGGER.info(ADD_USER_INPUT, user.toString());
			User savedUser = dao.save(user);
			if (savedUser != null) {
				LOGGER.info(ADD_USER_SUCCESS, user.toString());
			}
			return savedUser;
		} catch (UserException exception) {
			throw new UserException(String.format(ADD_USER_DAO_ERROR, user.toString()));
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
	@Override
	public User removeUser(User user) throws UserException {
		try {
			User userObj = dao.findByIdAndUsername(user.getId(), user.getUsername());
			if (userObj != null) {
				LOGGER.info(REMOVE_USER_INPUT, user.getUsername());
				dao.delete(userObj);
				LOGGER.info(REMOVE_USER_SUCCESS, user.getUsername());
			} else
				throw new UserException(String.format(REMOVE_USER_DAO_ERROR, user.toString()));
		} catch (UserException exception) {
			throw new UserException(String.format(REMOVE_USER_DAO_ERROR, user.toString()));
		}
		return user;
	}

}
