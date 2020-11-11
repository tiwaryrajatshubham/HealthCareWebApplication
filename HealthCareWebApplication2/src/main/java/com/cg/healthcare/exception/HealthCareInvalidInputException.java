package com.cg.healthcare.exception;

/**
 * HealthCareInvalidInputException is responsible to handle invalid inputs
 * related to Health Care app.
 * 
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @date 11/11/2020
 *
 */
public class HealthCareInvalidInputException extends UserException {

	private static final long serialVersionUID = 725949556838958207L;

	public HealthCareInvalidInputException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public HealthCareInvalidInputException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public HealthCareInvalidInputException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public HealthCareInvalidInputException(Throwable cause) {
		super(cause);
	}

}
