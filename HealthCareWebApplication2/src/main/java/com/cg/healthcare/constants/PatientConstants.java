package com.healthcare.constants;

/**
 * HealthCareSystemConstants class where all patient application constants and Test Result Constants are
 * declared
 * 
 * @author Sreekanth
 * @version 1.8
 * @date 10/26/2020
 */
public class PatientConstants {

	private PatientConstants() {
	}

	public static final String INVALID_INPUT = "HEALTH_CARE_API: Input object is not valid : %s";

	// Register Patient
		public static final String ADD_REGISTER_PATIENT_ERROR = "HEALTH_CARE_API: Error occurred while registering the patient : {}";
		public static final String ADD_REGISTER_PATIENT_INPUT = "HEALTH_CARE_API: Input to register patient : {}";
		public static final String ADD_REGISTER_PATIENT_SUCCESS = "HEALTH_CARE_API: Registering patient call successful for patient id : {}";
		public static final String ADD_REGISTER_PATIENT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while registering patient for patient id : %s";

	//Update Patient
		public static final String UPDATE_PATIENT_ERROR = "HEALTH_CARE_API: Error occurred while updating the patient : {}";
		public static final String UPDATE_PATIENT_INPUT = "HEALTH_CARE_API: Input to update patient : {}";
		public static final String UPDATE_PATIENT_SUCCESS = "HEALTH_CARE_API: Updating patient call successful for patient id : {}";
		public static final String UPDATE_PATIENT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while updating patient for patient id : %s";

	// View Patient
		public static final String RETRIEVE_VIEW_PATIENT_ERROR = "HEALTH_CARE_API: Error occurred while viewing patient for patient id : {}";
		public static final String RETRIEVE_VIEW_PATIENT_INPUT = "HEALTH_CARE_API: Input to patient dao for patient id : {}";
		public static final String RETRIEVE_VIEW_PATIENT_SUCCESS = "HEALTH_CARE_API: View patient call successful for item id : {}";
		public static final String RETRIEVE_VIEW_PATIENT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while viewing patient for patient id : %s";
		
	// getallTestResult
		public static final String RETRIEVE_ALL_TEST_RESULT_ERROR = "HEALTH_CARE_API: Error occurred while getting all Test Result for Test id : {}";
		public static final String RETRIEVE_ALL_TEST_RESULT_INPUT = "HEALTH_CARE_API: Input to getAllTestResult dao for Test id : {}";
		public static final String RETRIEVE_ALL_TEST_RESULT_SUCCESS = "HEALTH_CARE_API: Getting all Test Result call successful for Test id : {}";
		public static final String RETRIEVE_ALL_TEST_RESULT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while getting all Test Results for Test id : %s";

	// ViewTestResult
		public static final String RETRIEVE_VIEW_TEST_RESULT_ERROR = "HEALTH_CARE_API: Error occurred while getting viewing Test Result for Test id : {}";
		public static final String RETRIEVE_VIEW_TEST_RESULT_INPUT = "HEALTH_CARE_API: Input to ViewTestResult dao for Test id : {}";
		public static final String RETRIEVE_VIEW_TEST_RESULT_SUCCESS = "HEALTH_CARE_API: Viewing Test Result call successful for Test id : {}";
		public static final String RETRIEVE_VIEW_TEST_RESULT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while viewing Test Result for Test id : %s";
	
	//Add TestResult
		public static final String ADD_TEST_RESULT_ERROR = "HEALTH_CARE_API: Error occurred while Adding the test Result the patient : {}";
		public static final String ADD_TEST_RESULT_INPUT = "HEALTH_CARE_API: Input to add Test Result : {}";
		public static final String ADD_TEST_RESULT_SUCCESS = "HEALTH_CARE_API: Adding Test Result call successful for Test Result id : {}";
		public static final String ADD_TEST_RESULT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while Adding Test Result for Test Result id : %s";
	//update result
		public static final String UPDATE_TEST_RESULT_ERROR = "HEALTH_CARE_API: Error occurred while Updating the test Result the patient : {}";
		public static final String UPDATE_TEST_RESULT_INPUT = "HEALTH_CARE_API: Input to Updating Test Result : {}";
		public static final String UPDATE_TEST_RESULT_SUCCESS = "HEALTH_CARE_API: Updating Test Result call successful for Test Result id : {}";
		public static final String UPDATE_TEST_RESULT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while Updating Test Result for Test Result id : %s";
	//remove Test Result
		public static final String DELETE_TEST_RESULT_ERROR = "HEALTH_CARE_API: Error occurred while Removing the test Result the patient : {}";
		public static final String DELETE_TEST_RESULT_INPUT = "HEALTH_CARE_API: Input to Delete Test Result : {}";
		public static final String DELETE_TEST_RESULT_SUCCESS = "HEALTH_CARE_API: Deleting Test Result call successful for Test Result id : {}";
		public static final String DELETE_TEST_RESULT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while Deleting Test Result for Test Result id : %s";
		
	//viewResultsByPatient	
		public static final String RETRIEVE_VIEW_TEST_RESULTS_BY_PATIENT_ERROR = "HEALTH_CARE_API: Error occurred while getting viewing Test Result for Test id : {}";
		public static final String RETRIEVE_VIEW_TEST_RESULTS_BY_PATIENT_INPUT = "HEALTH_CARE_API: Input to ViewTestResult dao for Test id : {}";
		public static final String RETRIEVE_VIEW_TEST_RESULTS_BY_PATIENT_SUCCESS = "HEALTH_CARE_API: Viewing Test Result call successful for Test id : {}";
		public static final String RETRIEVE_VIEW_TEST_RESULTS_BY_PATIENT_DAO_ERROR = "HEALTH_CARE_API: Error occurred while viewing Test Result for Test id : %s";

}
