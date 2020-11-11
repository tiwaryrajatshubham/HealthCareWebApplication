package com.healthcare.exception;



/** PatientNotFoundException is responsible to handle all custom exceptions related to Health Care app.
 * @author Sreekanth Reddy
 * @version 1.0
 * @date 10/26/2020
 *
 */
public class PatientNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4916479103372132864L;

	
	public PatientNotFoundException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PatientNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PatientNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PatientNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
