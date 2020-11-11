package com.healthcare.controller;

import static com.healthcare.constants.PatientConstants.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.entity.Patient;
import com.healthcare.entity.TestResult;
import com.healthcare.exception.PatientNotFoundException;
import com.healthcare.service.IPatientService;
import com.healthcare.serviceImpl.IPatientServiceImpl;
import com.healthcare.util.PatientValidation;

/**
 * PatientController is a class to handle database requests from the clients
 * 
 * @author Sreekanth
 * 
 *
 *
 */
@RestController
@RequestMapping("/api/patient")
public class PatientController {
	@Autowired
	private PatientValidation HealthCareValidation;
	@Autowired
	private IPatientService dao;
	private static final Logger LOGGER = LoggerFactory.getLogger(PatientController.class);
	
	@PostMapping("/register")
	public ResponseEntity<Patient> RegisterPatient(@RequestBody Patient patient) {
		try {
			HealthCareValidation.validateObject(patient);
			return new ResponseEntity<Patient>(dao.registerPatient(patient), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(ADD_REGISTER_PATIENT_ERROR, patient, exception);
			return new ResponseEntity<Patient>(new Patient(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/updatepatient")
	public ResponseEntity<Patient> updatePatientDetails(@RequestBody Patient patient ) {
		try {
			HealthCareValidation.validateObject(patient);
			return new ResponseEntity<Patient>(dao.updatePatientDetails(patient), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(UPDATE_PATIENT_ERROR, patient, exception);
			return new ResponseEntity<Patient>(new Patient(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/viewpatient")
	public ResponseEntity<Patient> viewPatient(@RequestBody Patient patient) {
		try {
			HealthCareValidation.validateObject(patient);
			return new ResponseEntity<Patient>(dao.viewPatient(patient), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(UPDATE_PATIENT_ERROR, patient, exception);
			return new ResponseEntity<Patient>(new Patient(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/allTestResult")
	public ResponseEntity<List<TestResult>> getAllTestResult(@PathVariable("patientUserName") long patientUserName) {
		try {
			HealthCareValidation.validateObject(getAllTestResult(patientUserName));
			return new ResponseEntity<List<TestResult>>(dao.getAllTestResult(patientUserName), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(RETRIEVE_ALL_TEST_RESULT_ERROR, patientUserName, exception);
			return new ResponseEntity(RETRIEVE_ALL_TEST_RESULT_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
	
	@PutMapping("/viewTestResult/{TestResultById}")
	public ResponseEntity<TestResult> viewTestResult(@PathVariable("testResultId") long testResultId) {
		try {
			HealthCareValidation.validateObject(testResultId);
			return new ResponseEntity<TestResult>(dao.viewTestResult(testResultId), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(UPDATE_PATIENT_ERROR, testResultId, exception);
			return new ResponseEntity(UPDATE_PATIENT_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		}
}
