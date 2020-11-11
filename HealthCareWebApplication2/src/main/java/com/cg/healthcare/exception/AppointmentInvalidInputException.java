package com.cg.healthcare.exception;


/** AppointmentInvalidInputException is responsible to handle invalid inputs related to Appointment.
 * @author Karan Sehgal(alias)
 * @version 1.0
 * @date 10/26/2020
 *
 */
public class AppointmentInvalidInputException extends AppointmentNotFoundException{

	private static final long serialVersionUID = 725949556838958207L;

	
	public AppointmentInvalidInputException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AppointmentInvalidInputException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public AppointmentInvalidInputException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AppointmentInvalidInputException(Throwable cause) {
		super(cause);
	}
	
	

}
