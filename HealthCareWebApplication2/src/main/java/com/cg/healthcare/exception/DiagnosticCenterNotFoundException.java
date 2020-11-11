package com.cg.healthcare.exception;



/** FoodDeliveryException is responsible to handle all custom exceptions related to food delivery app.
 * @author Harshal Gavhane(alias)
 * @version 1.0
 * @date 10/26/2020
 *
 */
public class DiagnosticCenterNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4916479103372132864L;

	/**
	 * 
	 */
	public DiagnosticCenterNotFoundException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DiagnosticCenterNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public DiagnosticCenterNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public DiagnosticCenterNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
