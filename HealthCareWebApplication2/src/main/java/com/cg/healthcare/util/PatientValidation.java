package com.healthcare.util;

import org.springframework.stereotype.Component;

import com.healthcare.constants.PatientConstants;
import com.healthcare.exception.PatientNotFoundException;
import com.healthcare.exception.PatientInvalidInputException;

@Component("PatientValidation")
public class PatientValidation {
	
	/**validateObject method checks if input is null
	 * @param object
	 * @throws PatientInvalidInputException
	 */
	public void validateObject(Object object) throws PatientInvalidInputException {
		try {
			object.toString();
		}catch(NullPointerException exception) {
			throw new PatientNotFoundException(String.format(PatientConstants.INVALID_INPUT, object), exception);
		}
	}

}
