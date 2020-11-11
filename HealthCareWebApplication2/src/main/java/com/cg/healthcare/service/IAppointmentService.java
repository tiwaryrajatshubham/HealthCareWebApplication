package com.cg.healthcare.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.cg.healthcare.entity.Appointment;
import com.cg.healthcare.exception.AppointmentNotFoundException;
/**
* The IAppointmentService program is an interface that
* performs appointment related operations.
*
* @author  Karan Sehgal(alias)
* @version 1.0
* @since   11/07/2020 
*/

@Service
public interface IAppointmentService {

	public Appointment addAppointment(Appointment appointment);
	public Appointment removeAppointment(Appointment appointment) throws AppointmentNotFoundException;
	Set<Appointment> viewAppointments(String patientName);
	Appointment viewAppointment(long appointmentId);
	Appointment updateAppointment(Appointment appointment);
	public List<Appointment> getApppointmentList(int centreId, String test, int status);
}
