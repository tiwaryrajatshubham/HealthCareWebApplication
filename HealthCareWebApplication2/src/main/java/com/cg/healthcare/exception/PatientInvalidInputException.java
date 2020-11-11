package com.healthcare.exception;


/** HealthCareInvalidInputsException is responsible to handle invalid inputs related to HealthCare app.
 * @author Sreekanth Reddy
 * @version 1.0
 * @date 10/26/2020
 *
 */
public class PatientInvalidInputException extends PatientNotFoundException{

	private static final long serialVersionUID = 725949556838958207L;

	
	public PatientInvalidInputException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PatientInvalidInputException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PatientInvalidInputException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PatientInvalidInputException(Throwable cause) {
		super(cause);
	}
	
	

}
