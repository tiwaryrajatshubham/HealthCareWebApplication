package com.healthcare.service;
import com.healthcare.exception.*;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.healthcare.entity.TestResult;
import com.healthcare.entity.Patient;
@Service
public interface ITestResultService {

	public TestResult addTestResult(TestResult testResult) throws PatientNotFoundException;
	
	public TestResult updateResult(TestResult testResult) throws PatientNotFoundException;
	
	public TestResult removeTestResult(long TestId) throws PatientNotFoundException;
	
	public Set<TestResult> viewResultsByPatient(Patient patient) throws PatientNotFoundException;
	

}
