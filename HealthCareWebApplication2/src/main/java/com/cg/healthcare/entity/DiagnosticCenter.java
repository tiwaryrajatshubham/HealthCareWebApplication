package com.cg.healthcare.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DiagnosticCenter implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String contactNo;
	private String address;
	private String contactEmail;
	private List<String> servicesOffered;
	private Set<DiagnosticTest> tests = new HashSet<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public List<String> getServicesOffered() {
		return servicesOffered;
	}
	public void setServicesOffered(List<String> servicesOffered) {
		this.servicesOffered = servicesOffered;
	}
	public Set<DiagnosticTest> getTests() {
		return tests;
	}
	public void setTests(Set<DiagnosticTest> tests) {
		this.tests = tests;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
