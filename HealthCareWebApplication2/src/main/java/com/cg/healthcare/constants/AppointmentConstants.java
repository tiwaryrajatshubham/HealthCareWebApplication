package com.cg.healthcare.constants;

/**
 * HealthCareConstants class where all health care application constants are
 * declared
 * 
 * @author Karan Sehgal(alias)
 * @version 1.0
 * @date 11/05/2020
 */

public class AppointmentConstants {

	private AppointmentConstants() {
	}

	public static final String INVALID_INPUT = "HEALTHCARE_APPLICATION_API: Input object is not valid : %s";

	// Add Appointment
	public static final String ADD_APPOINTMENT_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while adding appointment : {}";
	public static final String ADD_APPOINTMENT_INPUT = "HEALTHCARE_APPLICATION_API: Input for adding appointment : {}";
	public static final String ADD_APPOINTMENT_SUCCESS = "HEALTHCARE_APPLICATION_API: Add appointment successful for user : {}";
	public static final String ADD_APPOINTMENT_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while adding appointment : %s";

	// View Appointment by Name
	public static final String VIEW_APPOINTMENT_BYNAME_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while viewing appointment by name : {}";
	public static final String VIEW_APPOINTMENT_BYNAME_INPUT = "HEALTHCARE_APPLICATION_API: Input to view appointment by name : {}";
	public static final String VIEW_APPOINTMENT_BYNAME_SUCCESS = "HEALTHCARE_APPLICATION_API: View appointment by name successful for user : {}";
	public static final String VIEW_APPOINTMENT_BYNAME_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while viewing appointment by name : %s";
	
	// View Appointment by ID
	public static final String VIEW_APPOINTMENT_BYID_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while viewing appointment by ID : {}";
	public static final String VIEW_APPOINTMENT_BYID_INPUT = "HEALTHCARE_APPLICATION_API: Input to view appointment by ID : {}";
	public static final String VIEW_APPOINTMENT_BYID_SUCCESS = "HEALTHCARE_APPLICATION_API: View appointment by ID successful for user : {}";
	public static final String VIEW_APPOINTMENT_BYID_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while viewing appointment by ID : %s";
	
	// Update Appointment
	public static final String UPDATE_APPOINTMENT_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while updating appointment : {}";
	public static final String UPDATE_APPOINTMENT_INPUT = "HEALTHCARE_APPLICATION_API: Input for updating appointment : {}";
	public static final String UPDATE_APPOINTMENT_SUCCESS = "HEALTHCARE_APPLICATION_API: Update appointment successful for user : {}";
	public static final String UPDATE_APPOINTMENT_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while updating appointment : %s";
	
	// Remove Appointment
	public static final String REMOVE_APPOINTMENT_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while removing appointment : {}";
	public static final String REMOVE_APPOINTMENT_INPUT = "HEALTHCARE_APPLICATION_API: Input for removing appointment : {}";
	public static final String REMOVE_APPOINTMENT_SUCCESS = "HEALTHCARE_APPLICATION_API: Remove call successful for appointment : {}";
	public static final String REMOVE_APPOINTMENT_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while removing appointment : %s";
	
	// Retrieve Appointment List
	public static final String RETRIEVE_APPOINTMENT_LIST_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving appointment list : {}";
	public static final String RETRIEVE_APPOINTMENT_LIST_INPUT = "HEALTHCARE_APPLICATION_API: Input for retrieving appointment list : {}";
	public static final String RETRIEVE_APPOINTMENT_LIST_SUCCESS = "HEALTHCARE_APPLICATION_API: Retrieve appointment list successful for user : {}";
	public static final String RETRIEVE_APPOINTMENT_LIST_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving appointment list : %s";

}
