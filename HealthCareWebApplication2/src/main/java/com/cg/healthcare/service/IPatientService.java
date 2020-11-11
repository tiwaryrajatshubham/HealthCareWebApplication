package com.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.healthcare.entity.TestResult;
import com.healthcare.entity.Patient;

import com.healthcare.exception.PatientNotFoundException;

/** IPatientService interface is used to call database related to patient
 * @author Harshal Gavhane(alias)
 * @version 1.0
 * @date 10/26/2020
 *
 */

@Service
public interface IPatientService {
	
	
	public Patient registerPatient(Patient patient) throws PatientNotFoundException;
	
	public Patient updatePatientDetails(Patient patient) throws PatientNotFoundException;
	
	public Patient viewPatient(Patient patientUserName) throws PatientNotFoundException;
	
	public List<TestResult> getAllTestResult(long patientUserName) throws PatientNotFoundException;
	
	public TestResult viewTestResult(long testResultId) throws PatientNotFoundException;
}