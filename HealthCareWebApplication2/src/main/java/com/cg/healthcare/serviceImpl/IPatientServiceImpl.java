package com.healthcare.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.healthcare.repository.IPatientRepository;
import com.healthcare.entity.Patient;
import com.healthcare.entity.TestResult;
import com.healthcare.exception.PatientNotFoundException;
import com.healthcare.service.IPatientService;
import com.healthcare.controller.PatientController;

import static com.healthcare.constants.PatientConstants.*;

/**
 * IPatientServiceImpl class implements IPatientService interface methods
 * 
 * @author Harshal Gavhane(alias)
 * @version 1.0
 * @date 10/26/2020
 *
 */
@Component
public abstract class IPatientServiceImpl implements IPatientService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PatientController.class);
	
	@Autowired
	public IPatientRepository dao;
	/**
	 * viewItem method return object of items available as per item id
	 * 
	 * @method viewItem()
	 * @param itemId {@ link as String}
	 * @objective method to view food item
	 * @return Item
	 */
	@Override
	public Patient registerPatient(Patient patient) throws PatientNotFoundException {
		try {
			LOGGER.info(ADD_REGISTER_PATIENT_INPUT, patient.toString());
			Patient patientobj=dao.save(patient);
			LOGGER.info(ADD_REGISTER_PATIENT_SUCCESS, patientobj.toString());
			return patientobj;
		} catch (Exception exception) {
			throw new PatientNotFoundException(String.format(ADD_REGISTER_PATIENT_ERROR, patient.toString()), exception);
		}
	}

	@Override
	public Patient updatePatientDetails(Patient patient) throws PatientNotFoundException {
		try {
			LOGGER.info(UPDATE_PATIENT_INPUT, patient.toString());
			Patient patientobj=dao.save(patient);
			LOGGER.info(UPDATE_PATIENT_SUCCESS, patientobj.toString());
			return patientobj;
		} catch (Exception exception) {
			throw new PatientNotFoundException(String.format(UPDATE_PATIENT_ERROR, patient.toString()), exception);
		}
	}

	@Override
	public Patient viewPatient(Patient patientUserName) throws PatientNotFoundException {
		try {
			LOGGER.info(RETRIEVE_VIEW_PATIENT_INPUT, patientUserName.toString());
			Patient patientobj=dao.viewPatient(patientUserName);
			LOGGER.info(RETRIEVE_VIEW_PATIENT_SUCCESS, patientobj.toString());
			return patientobj;
		} catch (Exception exception) {
			throw new PatientNotFoundException(String.format(RETRIEVE_VIEW_PATIENT_ERROR, patientUserName.toString()), exception);
		}
	}

	@Override
	public List<TestResult> getAllTestResult(long patientUserName) throws PatientNotFoundException {
		try {
			LOGGER.info(RETRIEVE_VIEW_TEST_RESULT_INPUT, patientUserName);
			List<TestResult> patientobj=dao.findByTestResult(patientUserName);
			LOGGER.info(RETRIEVE_VIEW_TEST_RESULT_SUCCESS, patientobj.toString());
			return patientobj;
		} catch (Exception exception) {
			throw new PatientNotFoundException(String.format(RETRIEVE_VIEW_TEST_RESULT_ERROR, patientUserName), exception);
		}
	}
}