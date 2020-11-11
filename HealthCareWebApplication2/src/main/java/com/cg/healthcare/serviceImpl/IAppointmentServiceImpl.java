/**
* The IAppointmentServiceImpl program is an implementation of IAppointmentService interface that
* performs appointment related operations.
*
* @author  Karan Sehgal
* @version 1.0
* @since   2020-10-21 
*/

package com.cg.healthcare.serviceImpl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.healthcare.repository.IAppointmentRepository;
import com.cg.healthcare.service.IAppointmentService;
import static com.cg.healthcare.constants.AppointmentConstants.*;

import com.cg.healthcare.entity.Appointment;
import com.cg.healthcare.exception.AppointmentNotFoundException;

@Component
public abstract class IAppointmentServiceImpl implements IAppointmentService {
	@Autowired
	private IAppointmentRepository dao;
	private static final Logger LOGGER = LoggerFactory.getLogger(IAppointmentServiceImpl.class);
	

	
	

	/**
	 * addAppointment method adds appointment
	 * 
	 * @method addAppointment()
	 * @param user {@ link as Appointment}
	 * @objective method to add Appointment
	 * @return Appointment
	 */
	@Override
	public Appointment addAppointment(Appointment appointment) throws AppointmentNotFoundException {

		
			LOGGER.info(ADD_APPOINTMENT_INPUT, appointment.toString());
			Appointment savedAppointment = dao.save(appointment);
			if(savedAppointment!=null) {
			LOGGER.info(ADD_APPOINTMENT_SUCCESS, appointment.toString());
			}
			else {
			throw new AppointmentNotFoundException(String.format(ADD_APPOINTMENT_DAO_ERROR, appointment.toString()));
		}
			return savedAppointment;
	}

	/**
	 * removeAppointment method removes Appointment
	 * 
	 * @method removeAppointment()
	 * @param Appointment {@ link as Appointment}
	 * @objective method to remove Appointment
	 * @return Appointment
	 */
	@Override
	public Appointment removeAppointment(Appointment appointment) throws AppointmentNotFoundException {
		Appointment appointmentObj=dao.findAppointmentById(appointment.getId());
		if(appointmentObj!=null) {
			LOGGER.info(REMOVE_APPOINTMENT_INPUT, appointment.getId());
			dao.delete(appointmentObj);
			LOGGER.info(REMOVE_APPOINTMENT_SUCCESS, appointment.getId());
		}
		else {
			throw new AppointmentNotFoundException(String.format(REMOVE_APPOINTMENT_DAO_ERROR,appointment.toString()));
		}
			return appointment;
	}

	@Override
	public Set<Appointment> viewAppointments(String patientName) throws AppointmentNotFoundException {
		Set<Appointment> appointment= dao.findAppointmentByName(patientName);
		return appointment;
	}

	@Override
	public Appointment viewAppointment(long appointmentId) throws AppointmentNotFoundException {
		Appointment appointment= dao.findAppointmentById(appointmentId);
		return appointment;
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) throws AppointmentNotFoundException {
		Appointment appointmentObj= dao.save(appointment);
		return appointmentObj;
	}

	/*@Override
	public List<Appointment> getApppointmentList(int centreId, String test, int status) throws AppointmentNotFoundException {
		return dao.findAll();
	}*/

}

