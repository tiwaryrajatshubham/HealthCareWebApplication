package com.cg.healthcare.constants;

/**
 * HealthCareApplicationConstants class where all health care application constants are
 * declared
 * 
 * @author Rishab Saxena(alias)
 * @version 1.0
 * @date 11/06/2020
 */
public class DiagnosticCenterConstants {

	private DiagnosticCenterConstants() {
	}

	public static final String INVALID_INPUT = "HEALTHCARE_APPLICATION_API: Input object is not valid : %s";

		// Retrieve AllDiagnosticCenters
		public static final String RETRIEVE_ALLDIAGN0STICCENTERS_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving diagnostic centers  : {}";
		public static final String RETRIEVE_ALLDIAGN0STICCENTERS_INPUT = "HEALTHCARE_APPLICATION_API: Input to view diagnostic centers : {}";
		public static final String RETRIEVE_ALLDIAGN0STICCENTERS_SUCCESS = "HEALTHCARE_APPLICATION_API: View diagnostic centers call successful : {}";
		public static final String RETRIEVE_ALLDIAGNOSTICCENTERS_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving diagnostic centers : %s";

		// Add DiagnosticCenters
		public static final String ADD_DIAGNOSTICCENTERS_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while inserting diagnosticCenters : {}";
		public static final String ADD_DIAGNOSTICCENTERS_INPUT = "HEALTHCARE_APPLICATION_API: Input to insert  diagnosticCenters : {}";
		public static final String ADD_DIAGNOSTICCENTERS_SUCCESS = "HEALTHCARE_APPLICATION_API: Insert diagnosticCenters call successful : {}";
		public static final String ADD_DIAGNOSTICCENTERS_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while inserting  diagnosticCenters : %s";
	
		// Retrieve DiagnosticCenterById
		public static final String RETRIEVE_DIAGNOSTICCENTERBYID_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving diagnosticCenters for diagnosticCentersId : {}";
		public static final String RETRIEVE_DIAGNOSTICCENTERBYID_INPUT = "HEALTHCARE_APPLICATION_API: Input to view diagnosticCenters dao diagnosticCentersId : {}";
		public static final String RETRIEVE_DIAGNOSTICCENTERBYID_SUCCESS = "HEALTHCARE_APPLICATION_API: View diagnosticCenters call successful for diagnosticCentersId : {}";
		public static final String RETRIEVE_DIAGNOSTICCENTERBYID_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving diagnosticCenters for diagnosticCentersId : %s";

		// Update DiagnosticCenters
		public static final String UPDATE_DIAGNOSTICCENTERS_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while updating diagnosticCenters : {}";
		public static final String UPDATE_DIAGNOSTICCENTERS_INPUT = "HEALTHCARE_APPLICATION_API: Input to update diagnosticCenters : {}";
		public static final String UPDATE_DIAGNOSTICCENTERS_SUCCESS = "HEALTHCARE_APPLICATION_API: Update diagnosticCenters call successful : {}";
		public static final String UPDATE_DIAGNOSTICCENTERS_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while updating  diagnosticCenters : %s";
		
		// Retrieve viewTestDetails
		public static final String RETRIEVE_VIEWTESTDETAILS_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving diagnosticCenters for diagnosticCentersId and testName : {}";
		public static final String RETRIEVE_VIEWTESTDETAILS_INPUT = "HEALTHCARE_APPLICATION_API: Input to view diagnosticCenters dao  diagnosticCentersId and testName : {}";
		public static final String RETRIEVE_VIEWTESTDETAILS_SUCCESS = "HEALTHCARE_APPLICATION_API: View diagnosticCenters call successful for  diagnosticCentersId and testName : {}";
		public static final String RETRIEVE_VIEWTESTDETAILS_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving diagnosticCenters for  diagnosticCentersId and testName : %s";

		// Add Test
		public static final String ADD_TEST_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while inserting diagnosticcentersId and testid : {}";
		public static final String ADD_TEST_INPUT = "HEALTHCARE_APPLICATION_API: Input to insert  diagnosticcentersId and testid : {}";
		public static final String ADD_TEST_SUCCESS = "HEALTHCARE_APPLICATION_API: Insert diagnosticCenters call successful for diagnosticcentersId and testid : {}";
		public static final String ADD_TEST_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while inserting  diagnosticCenters for diagnosticcentersId and testid : %s";

		// Retrieve DiagnosticCenter by centerName
		public static final String RETRIEVE_DIAGNOSTICCENTER_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving diagnosticCenters for centername : {}";
		public static final String RETRIEVE_DIAGNOSTICCENTER_INPUT = "HEALTHCARE_APPLICATION_API: Input to view diagnosticCenters dao  centername : {}";
		public static final String RETRIEVE_DIAGNOSTICCENTER_SUCCESS = "HEALTHCARE_APPLICATION_API: View diagnosticCenters call successful for  centername : {}";
		public static final String RETRIEVE_DIAGNOSTICCENTER_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving diagnosticCenters for  centername : %s";
	
		// Remove DiagnosticCenter by ID
		public static final String REMOVE_DIAGNOSTICCENTER_ERROR = "HEALTH_CARE_API: Error occurred while removing DiagnosticCenter for id : {}";
		public static final String REMOVE_DIAGNOSTICCENTER_INPUT = "HEALTH_CARE_API: Input for removing DiagnosticCenter for id : {}";
		public static final String REMOVE_DIAGNOSTICCENTER_SUCCESS = "HEALTH_CARE_API: Remove call successful for DiagnosticCenter for id : {}";
		public static final String REMOVE_DIAGNOSTICCENTER_DAO_ERROR = "HEALTH_CARE_API: Error occurred while removing DiagnosticCenter for id : %s";
			  
		 // Retrieve ListOfAppointments
		public static final String RETRIEVE_LISTOFAPPOINTMENTS_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving ListOfAppointments for centername : {}";
		public static final String RETRIEVE_LISTOFAPPOINTMENTS_INPUT = "HEALTHCARE_APPLICATION_API: Input to view ListOfAppointments dao  centername : {}";
		public static final String RETRIEVE_LISTOFAPPOINTMENTS_SUCCESS = "HEALTHCARE_APPLICATION_API: View ListOfAppointments call successful for  centername : {}";
		public static final String RETRIEVE_LISTOFAPPOINTMENTS_DAO_ERROR = "HEALTHCARE_APPLICATION_API: Error occurred while retrieving ListOfAppointments for  centername : %s";
	
			    

}
