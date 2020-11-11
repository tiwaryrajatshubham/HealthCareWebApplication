package com.cg.healthcare.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.healthcare.entity.Appointment;
/**
* The IAppointmentRepository performs database operations related to appointment.
* 
*
* @author  Karan Sehgal(alias)
* @version 1.0
* @since   11/07/2020 
*/

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Long> {

	Appointment findAppointmentById(long appointmentId);

	Set<Appointment> findAppointmentByName(String patientName);
}
