package com.cg.healthcare.exception;



/** AppointmentNotFoundException is responsible to handle all custom exceptions related to Appointment.
 * @author Karan Sehgal(alias)
 * @version 1.0
 * @date 10/26/2020
 *
 */
public class AppointmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4916479103372132864L;

	/**
	 * 
	 */
	public AppointmentNotFoundException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AppointmentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public AppointmentNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AppointmentNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
