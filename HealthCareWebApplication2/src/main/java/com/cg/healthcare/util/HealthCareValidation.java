package com.cg.healthcare.util;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Component;

import com.cg.healthcare.constants.UserConstants;
import com.cg.healthcare.exception.HealthCareInvalidInputException;
import com.cg.healthcare.exception.UserException;

/**
 * HealthCareValidation class is for input param validation methods related to
 * User
 * 
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @date 11/11/2020
 *
 */
@Component("HealthCareValidation")
public class HealthCareValidation {

	/**
	 * validateObject method checks if input is null
	 * 
	 * @param object
	 * @throws HealthCareInvalidInputException
	 */
	public void validateObject(Object object) throws HealthCareInvalidInputException {
		try {
			object.toString();
		} catch (NullPointerException exception) {
			throw new UserException(String.format(UserConstants.INVALID_INPUT, object), exception);
		}
	}

}
