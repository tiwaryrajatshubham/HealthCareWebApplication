package com.healthcare.repository;

import java.util.Set;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.entity.Patient;
import com.healthcare.entity.TestResult;


@Repository
public interface ITestResultRepository extends JpaRepository<TestResult, Integer> {

	public TestResult removeTestResult(long testId);

	public Set<TestResult> findByPatient(Patient patient);
	
//	public TestResult removeTestResult(long TestId);
//	
//	public Set<TestResult> viewResultsByPatient(Patient patient);
//
//	public TestResult updateResult(TestResult testResult);
//	
//	
}
