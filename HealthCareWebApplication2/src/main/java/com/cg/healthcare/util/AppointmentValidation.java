package com.cg.healthcare.util;

import org.springframework.stereotype.Component;

import com.cg.healthcare.constants.AppointmentConstants;
import com.cg.healthcare.exception.AppointmentNotFoundException;
import com.cg.healthcare.exception.AppointmentInvalidInputException;

/**
 * HealthCareValidation class is for input param validation
 * methods related to Appointment
 * 
 * @author Karan Sehgal(alias)
 * @version 1.0
 * @date 11/07/2020
 *
 */
@Component("AppointmentValidation")
public class AppointmentValidation {
	
	/**validateObject method checks if input is null
	 * @param object
	 * @throws AppointmentInvalidInputException
	 */
	public void validateObject(Object object) throws AppointmentInvalidInputException {
		try {
			object.toString();
		}catch(NullPointerException exception) {
			throw new AppointmentNotFoundException(String.format(AppointmentConstants.INVALID_INPUT, object), exception);
		}
	}

}
