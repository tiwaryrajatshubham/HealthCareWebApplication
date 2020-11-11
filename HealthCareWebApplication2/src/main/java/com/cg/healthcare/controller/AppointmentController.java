package com.cg.healthcare.controller;

import static com.cg.healthcare.constants.AppointmentConstants.*;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthcare.entity.Appointment;
import com.cg.healthcare.exception.AppointmentNotFoundException;
import com.cg.healthcare.service.IAppointmentService;
import com.cg.healthcare.util.AppointmentValidation;

/**
 * HealthCareController is a class to handle requests
 * 
 * @author Karan Sehgal(alias)
 * @version 1.0
 * @date 11/05/2020
 *
 */

@RestController
@RequestMapping("/HealthCare")
public class AppointmentController {

	@Autowired
	private AppointmentValidation healthcarevalidation;

	@Autowired
	private IAppointmentService iappointmentservice;

	private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentController.class);

	
	/**
	 * addAppointment method adds Appointment
	 * 
	 * @method addAppointment()
	 * @param appointment {@link as Appointment}
	 * @objective method to add appointment
	 * @return Appointment
	 */
	@PostMapping("/addAppointment")
    public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointment) throws Exception {
        try {
        	healthcarevalidation.validateObject(appointment);
            return new ResponseEntity<Appointment>(iappointmentservice.addAppointment(appointment),HttpStatus.OK);
        } catch ( AppointmentNotFoundException exception) {
            LOGGER.error(ADD_APPOINTMENT_ERROR, appointment.toString(), exception);
            return new ResponseEntity<Appointment>(iappointmentservice.addAppointment(appointment),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	/**
	 * updateAppointment method updates Appointment
	 * 
	 * @method updateAppointment()
	 * @param appointment {@link as Appointment}
	 * @objective method to update appointment
	 * @return Appointment
	 */
	@PutMapping("/updateAppointment")
    public ResponseEntity<Appointment>updateAppointment(@RequestBody Appointment appointment) throws Exception {
        try {
        	healthcarevalidation.validateObject(appointment);
            return new ResponseEntity<Appointment>(iappointmentservice.updateAppointment(appointment),HttpStatus.OK);
        } catch ( AppointmentNotFoundException exception) {
            LOGGER.error(UPDATE_APPOINTMENT_ERROR, appointment.toString(), exception);
            return new ResponseEntity<Appointment>(iappointmentservice.updateAppointment(appointment),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	/**
	 * removeAppointment method removes Appointment
	 * 
	 * @method removeAppointment()
	 * @param appointment {@link as Appointment}
	 * @objective method to remove appointment
	 * @return Appointment
	 */
	@DeleteMapping("/removeAppointment")
	public ResponseEntity<Appointment> removeAppointment(@RequestBody Appointment appointment) {
		try {
			 healthcarevalidation.validateObject(appointment);
			return new ResponseEntity<Appointment>(iappointmentservice.removeAppointment(appointment), HttpStatus.OK);
		} catch ( AppointmentNotFoundException exception) {
			LOGGER.error(REMOVE_APPOINTMENT_ERROR ,appointment, exception);
			return new ResponseEntity(REMOVE_APPOINTMENT_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * viewAppointment method retrieves Appointment by id
	 * 
	 * @method viewAppointment()
	 * @param appointment {@link as Appointment}
	 * @objective method to retrieve appointment by id
	 * @return Appointment
	 */
	@GetMapping("/view/{viewAppointment}")
	public ResponseEntity<Appointment> viewAppointment(@PathVariable("viewAppointment") long appointmentId) {
		try {
			 healthcarevalidation.validateObject(appointmentId);
			return new ResponseEntity<Appointment>(iappointmentservice.viewAppointment(appointmentId), HttpStatus.OK);
		} catch ( AppointmentNotFoundException exception) {
			LOGGER.error(VIEW_APPOINTMENT_BYID_ERROR,appointmentId , exception);
			return new ResponseEntity(VIEW_APPOINTMENT_BYID_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * viewAppointments method retrieves Appointment by patientName
	 * 
	 * @method viewAppointments()
	 * @param appointment {@link as Appointment}
	 * @objective method to retrieve appointment by patientName
	 * @return Appointment
	 */
	@GetMapping("/view/{viewAppointments}")
	public ResponseEntity<Set<Appointment>> viewAppointments(@PathVariable("viewAppointments") String patientName) {
		try {
			 healthcarevalidation.validateObject(patientName);
			return new ResponseEntity<Set<Appointment>>(iappointmentservice.viewAppointments(patientName), HttpStatus.OK);
		} catch ( AppointmentNotFoundException exception) {
			LOGGER.error(VIEW_APPOINTMENT_BYNAME_ERROR,patientName , exception);
			return new ResponseEntity(VIEW_APPOINTMENT_BYNAME_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * getApppointmentList method retrieves Appointment list
	 * 
	 * @method getApppointmentList()
	 * @param appointment {@link as Appointment}
	 * @objective method to retrieve appointment list
	 * @return Appointment
	 */
	/*@GetMapping("/getApppointmentList")
	public ResponseEntity<List<Appointment>> getApppointmentList() {
		try {
			healthcarevalidation.validateObject(getApppointmentList());
			return new ResponseEntity<List<Apppointment>>(iappointmentservice.getApppointmentList(), HttpStatus.OK);
		} catch ( AppointmentNotFoundException exception) {
			LOGGER.error( RETRIEVE_APPOINTMENT_LIST_ERROR,getApppointmentList(), exception);
			return new ResponseEntity(RETRIEVE_APPOINTMENT_LIST_ERROR,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/

}
