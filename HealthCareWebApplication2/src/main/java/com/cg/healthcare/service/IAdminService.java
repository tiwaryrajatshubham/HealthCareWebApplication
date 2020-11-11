package com.cg.healthcare.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.cg.healthcare.entity.User;
import com.cg.healthcare.exception.UserException;

/**
 * The IAdminService program is an interface that performs admin related
 * operations.
 *
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @since 11/11/2020
 */
@Service
public interface IAdminService {

	public User registerAdmin(String username, String password) throws UserException;
}