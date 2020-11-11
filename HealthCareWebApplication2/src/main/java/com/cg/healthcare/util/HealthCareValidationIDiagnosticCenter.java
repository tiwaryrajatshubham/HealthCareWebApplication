package com.cg.healthcare.util;

import org.springframework.stereotype.Component;

import com.cg.healthcare.constants.DiagnosticCenterConstants;
import com.cg.healthcare.exception.DiagnosticCenterInvalidInputException;
import com.cg.healthcare.exception.DiagnosticCenterNotFoundException;
/**
 * HealthCareValidation class is for input param validation
 * methods related to Diagnostic Centers.
 * 
 * @author Rishab Saxena(alias)
 * @version 1.0
 * @date 11/06/2020
 *
 */
@Component("HealthCareValidation")
public class HealthCareValidationIDiagnosticCenter {
	
	/**validateObject method checks if input is null
	 * @param object
	 * @throws DiagnosticCenterNotFoundException
	 */
	public void validateObject(Object object) throws DiagnosticCenterInvalidInputException {
		try {
			object.toString();
		}catch(NullPointerException exception) {
			throw new DiagnosticCenterNotFoundException(String.format(DiagnosticCenterConstants.INVALID_INPUT, object), exception);
		}
	}

}
