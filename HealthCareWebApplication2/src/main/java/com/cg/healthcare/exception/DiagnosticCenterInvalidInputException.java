package com.cg.healthcare.exception;


/** DiagnosticCenterNotFoundException is responsible to handle invalid inputs related to Diagnostic Center app.
 * @author Rishab Saxena(alias)
 * @version 1.0
 * @date 10/26/2020
 *
 */
public class DiagnosticCenterInvalidInputException extends DiagnosticCenterNotFoundException{

	private static final long serialVersionUID = 725949556838958207L;

	
	public DiagnosticCenterInvalidInputException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DiagnosticCenterInvalidInputException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public DiagnosticCenterInvalidInputException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public DiagnosticCenterInvalidInputException(Throwable cause) {
		super(cause);
	}
	
	

}
