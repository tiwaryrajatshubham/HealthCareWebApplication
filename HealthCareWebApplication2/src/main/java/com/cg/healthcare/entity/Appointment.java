/**
* The Appointment class creates a simple POJO 
* to store in data base.
* 
* @author  Tiwary Rajat Shubham
* @version 1.0
* @since   2020-10-21 
*/
package com.cg.healthcare.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "Appointment")
// Entity bean to store User object
public class Appointment implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private LocalDate appointmentDate;
	private AppointmentStatus approvalStatus;  
	private Set<DiagnosticTest> diagnosticTests; 
	private Patient patient;
	private DiagnosticCenter diagnosticCenter;
	private Set<TestResult> testResult;
	
	// Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public AppointmentStatus getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(AppointmentStatus approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public Set<DiagnosticTest> getDiagnosticTests() {
		return diagnosticTests;
	}
	public void setDiagnosticTests(Set<DiagnosticTest> diagnosticTests) {
		this.diagnosticTests = diagnosticTests;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
	public Set<TestResult> getTestResult() {
		return testResult;
	}
	public void setTestResult(Set<TestResult> testResult) {
		this.testResult = testResult;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentDate=" + appointmentDate + ", approvalStatus=" + approvalStatus
				+ ", diagnosticTests=" + diagnosticTests + ", patient=" + patient + ", diagnosticCenter="
				+ diagnosticCenter + ", testResult=" + testResult + "]";
	}

}
