package com.healthcare.controller;
import static com.healthcare.constants.PatientConstants.*;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.healthcare.serviceImpl.ITestResultServiceImpl;
import com.healthcare.util.PatientValidation;
import com.healthcare.repository.*;
import com.healthcare.service.*;

/**
 * PatientController is a class to handle food item requests
 * 
 * @author Harshal Gavhane(alias)
 * @version 1.0
 * @date 10/26/2020
 *
 */
@RestController
@RequestMapping("/TestResult")
public class TestResultController {
	@Autowired
	private PatientValidation HealthCareValidation;
	@Autowired
	private ITestResultService ITestResultService;
	@Autowired
	private ITestResultServiceImpl ITestResultServiceImpl;
	@Autowired
	private ITestResultRepository dao;
	private static final Logger LOGGER = LoggerFactory.getLogger(TestResultController.class);
	
	@PostMapping("/addTestResult")
	public ResponseEntity<TestResult> addTestResult(@RequestBody TestResult testResult) {
		try {
			HealthCareValidation.validateObject(testResult);
			return new ResponseEntity<TestResult>(dao.save(testResult), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(ADD_TEST_RESULT_ERROR, testResult, exception);
			return new ResponseEntity<TestResult>(new TestResult(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/updateResult")
	public ResponseEntity<TestResult> updateResult(@RequestBody TestResult testResult) {
		try {
			HealthCareValidation.validateObject(testResult);
			return new ResponseEntity<TestResult>(dao.save(testResult), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(UPDATE_TEST_RESULT_ERROR, testResult, exception);
			return new ResponseEntity<TestResult>(new TestResult(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	/**
	 * addItem method adds food item.
	 * 
	 * @method addItem()
	 * @param item {@ link as Item}
	 * @objective method to add food item
	 * @return Item
	 */
//	TestResult removeTestResult(int TestId) throws HealthCareException;
	@DeleteMapping("/removeTestResult")
	public ResponseEntity<TestResult> removeTestResult(@RequestBody long Testid) {
		try {
			HealthCareValidation.validateObject(Testid);
			return new ResponseEntity<TestResult>(dao.removeTestResult(Testid), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(DELETE_TEST_RESULT_ERROR, Testid, exception);
			return new ResponseEntity<TestResult>(new TestResult(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Set<TestResult> viewResultsByPatient(Patient patient) throws HealthCareException;
	@GetMapping("/viewResultsByPatient")
	public ResponseEntity<Set<TestResult>> viewResultsByPatient(@RequestBody Patient patient) {
		try {
			HealthCareValidation.validateObject(patient);
			return new ResponseEntity<Set<TestResult>>(dao.findByPatient(patient), HttpStatus.OK);
		} catch (PatientNotFoundException exception) {
			LOGGER.error(RETRIEVE_ALL_TEST_RESULT_ERROR, patient, exception);
			return new ResponseEntity<Set<TestResult>>((Set<TestResult>) dao.findByPatient(patient),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
	
}




