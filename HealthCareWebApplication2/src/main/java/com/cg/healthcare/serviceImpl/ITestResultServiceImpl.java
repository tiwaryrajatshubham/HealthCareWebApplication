package com.healthcare.serviceImpl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.healthcare.entity.Patient;
import com.healthcare.entity.TestResult;


import com.healthcare.exception.PatientNotFoundException;
import com.healthcare.service.ITestResultService;
import com.healthcare.repository.ITestResultRepository;
import static com.healthcare.constants.PatientConstants.*;

@Component
public abstract class ITestResultServiceImpl implements ITestResultService {
	
	@Autowired
	public ITestResultRepository dao;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ITestResultServiceImpl.class);
	
	@Override
	public TestResult addTestResult(TestResult testResult) throws PatientNotFoundException {
		try {
			LOGGER.info(ADD_TEST_RESULT_INPUT, testResult);
			TestResult Testobj=dao.save(testResult);
			LOGGER.info(ADD_TEST_RESULT_SUCCESS, Testobj.toString());
			return Testobj;
		} catch (Exception exception) {
			throw new PatientNotFoundException(String.format(ADD_TEST_RESULT_ERROR, testResult.toString()), exception);
		}
	}
	@Override
	public TestResult updateResult(TestResult testResult) throws PatientNotFoundException {
		try {
		LOGGER.info(UPDATE_TEST_RESULT_INPUT, testResult);
		TestResult Testobj=dao.save(testResult);
		LOGGER.info(UPDATE_TEST_RESULT_SUCCESS, Testobj.toString());
		return Testobj;
		} catch (Exception exception) {
			throw new PatientNotFoundException(String.format(UPDATE_TEST_RESULT_ERROR, testResult.toString()), exception);
		}
	}
	@Override
	public TestResult removeTestResult(long TestId) throws PatientNotFoundException {
		try {
		LOGGER.info(DELETE_TEST_RESULT_INPUT, TestId);
		TestResult TestObj=dao.removeTestResult(TestId);
		LOGGER.info(DELETE_TEST_RESULT_SUCCESS, TestObj.toString());
		return TestObj;
	} catch (Exception exception) {
		throw new PatientNotFoundException(String.format(DELETE_TEST_RESULT_ERROR, TestId), exception);
	}
	}
	@Override
	public Set<TestResult> viewResultsByPatient(Patient patient)throws PatientNotFoundException {
		try {
			LOGGER.info(RETRIEVE_VIEW_TEST_RESULTS_BY_PATIENT_INPUT, patient);
			Set<TestResult> TestObj=dao.findByPatient(patient);
			LOGGER.info(RETRIEVE_VIEW_TEST_RESULTS_BY_PATIENT_SUCCESS, TestObj.toString());
			return TestObj;
		} catch (Exception exception) {
			throw new PatientNotFoundException(String.format(DELETE_TEST_RESULT_ERROR, patient), exception);
		}
	
	}
}