package com.healthcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.entity.TestResult;
import com.healthcare.entity.Patient;
/**
 * PatientRepository interface is used to call database request related to Patient
 * 
 * @author Harshal Gavhane(alias)
 * @version 1.0
 * @date 10/26/2020
 *
 */

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {

	public Patient viewPatient(Patient patientUserName);

	public List<TestResult> findByTestResult(long patientUserName);
	
	
//	public Patient findByPatient(Patient patientUserName);
//	
//	public List<TestResult> getAllTestResult(long patientUserName);
//	
//	public TestResult viewTestResult(long testResultId);
//	
}
