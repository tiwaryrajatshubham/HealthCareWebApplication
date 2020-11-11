package com.cg.healthcare.exception;

/**
 * UserException is responsible to handle all custom exceptions related to User.
 * 
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @date 11/11/2020
 *
 */
public class UserException extends RuntimeException {

	private static final long serialVersionUID = -4916479103372132864L;

	/**
	 * 
	 */
	public UserException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UserException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public UserException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public UserException(Throwable cause) {
		super(cause);
	}

}
