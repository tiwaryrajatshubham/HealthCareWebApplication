package com.cg.healthcare.service;

import org.springframework.stereotype.Service;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.exception.UserException;

/**
 * The IUserService program is an interface that performs user related
 * operations.
 *
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @since 11/11/2020
 */
@Service
public interface IUserService {

	public User validateUser(String username, String password) throws UserException;

	public User addUser(User user) throws UserException;

	public User removeUser(User user) throws UserException;
}
