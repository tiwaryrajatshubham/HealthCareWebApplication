package com.cg.healthcare.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class DiagnosticTest implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String testName;
	private double testPrice;
	private String normalValue;
	private String units;	
	private Set<DiagnosticCenter> diagnosticCenters = new HashSet<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public double getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}
	public String getNormalValue() {
		return normalValue;
	}
	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Set<DiagnosticCenter> getDiagnosticCenters() {
		return diagnosticCenters;
	}
	public void setDiagnosticCenters(Set<DiagnosticCenter> diagnosticCenters) {
		this.diagnosticCenters = diagnosticCenters;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
