package com.cg.healthcare.constants;

/**
 * HealthCareApplicationConstants class where all health care application
 * constants are declared
 * 
 * @author Tiwary Rajat Shubham(alias)
 * @version 1.0
 * @date 11/11/2020
 */
public class UserConstants {

	private UserConstants() {
	}

	public static final String INVALID_INPUT = "HEALTH_CARE_API: Input object is not valid : %s";

	// Remove user
	public static final String REMOVE_USER_ERROR = "HEALTH_CARE_API: Error occurred while removing user : {}";
	public static final String REMOVE_USER_INPUT = "HEALTH_CARE_API: Input for removing user : {}";
	public static final String REMOVE_USER_SUCCESS = "HEALTH_CARE_API: Remove call successful for user : {}";
	public static final String REMOVE_USER_DAO_ERROR = "HEALTH_CARE_API: Error occurred while removing user : %s";

	// Add user
	public static final String ADD_USER_ERROR = "HEALTH_CARE_API: Error occurred while adding user : {}";
	public static final String ADD_USER_INPUT = "HEALTH_CARE_API: Input for adding user : {}";
	public static final String ADD_USER_SUCCESS = "HEALTH_CARE_API: Add call successful for user : {}";
	public static final String ADD_USER_DAO_ERROR = "HEALTH_CARE_API: Error occurred while adding user : %s";

	// Validate user
	public static final String VALIDATE_USER_ERROR = "HEALTH_CARE_API: Error occurred while validating user : {}";
	public static final String VALIDATE_USER_INPUT = "HEALTH_CARE_API: Input for validating user : {}";
	public static final String VALIDATE_USER_SUCCESS = "HEALTH_CARE_API: Validate call successful for user : {}";
	public static final String VALIDATE_USER_DAO_ERROR = "HEALTH_CARE_API: Error occurred while validating user : %s";

	// Register admin
	public static final String REGISTER_ADMIN_ERROR = "HEALTH_CARE_API: Error occurred while registering admin : {}";
	public static final String REGISTER_ADMIN_INPUT = "HEALTH_CARE_API: Input for registering admin : {}";
	public static final String REGISTER_ADMIN_SUCCESS = "HEALTH_CARE_API: Register call successful for admin : {}";
	public static final String REGISTER_ADMIN_DAO_ERROR = "HEALTH_CARE_API: Error occurred while registering admin : %s";

}
