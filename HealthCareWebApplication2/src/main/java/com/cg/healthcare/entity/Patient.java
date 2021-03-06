package com.cg.healthcare.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;
	private int patientId;
	private String name;
	private String phoneNo;
	private int age;
	private String gender;
	private Set<Appointment> appointments=new HashSet<>();
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Set<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
