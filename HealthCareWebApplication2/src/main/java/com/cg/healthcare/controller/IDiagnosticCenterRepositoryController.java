package com.cg.healthcare.controller;
import java.util.List;


import static com.cg.healthcare.constants.DiagnosticCenterConstants.*;


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

import com.cg.healthcare.entity.DiagnosticCenter;
import com.cg.healthcare.exception.DiagnosticCenterNotFoundException;

import com.cg.healthcare.service.IDiagnosticCenterService;
import com.cg.healthcare.util.HealthCareValidationIDiagnosticCenter;

/**
 * DiagnosticCenter is a class to handle DiagnosticCenter requests
 * 
 * @author Rishab Saxena(alias)
 * @version 1.0
 * @date 11/06/2020
 *
 */

@RestController
@RequestMapping("/HealthCare")
public class IDiagnosticCenterRepositoryController {

	@Autowired
	private HealthCareValidationIDiagnosticCenter healthcarevalidation;

	@Autowired
	private IDiagnosticCenterService idiagnosticcenterservice;

	

	private static final Logger LOGGER = LoggerFactory.getLogger(IDiagnosticCenterRepositoryController.class);


/*	@GetMapping("/view/{itemId}")
	public ResponseEntity<Item> viewItem(@PathVariable("itemId") Long itemId) {
		try {
			foodDeliveryValidation.validateObject(itemId);
			return new ResponseEntity<Item>(iItemService.viewItem(itemId), HttpStatus.OK);
		} catch (DiagnosticCenterNotFoundException exception) {
			LOGGER.error(RETRIEVE_FOOD_ITEM_ERROR, itemId, exception);
			return new ResponseEntity<Item>(new Item(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/


	/*@RequestMapping(value = "/addDiagnosticCenter", method = RequestMethod.POST)
	public ResponseEntity<Item> addItem(@RequestBody Item item) {
		try {
			foodDeliveryValidation.validateObject(item);
			return new ResponseEntity<Item>(iItemService.addItem(item), HttpStatus.OK);
		} catch (DiagnosticCenterNotFoundException exception) {
			LOGGER.error(ADD_FOOD_ITEM_ERROR, item.toString(), exception);
			return new ResponseEntity<Item>(new Item(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
	@PostMapping("/addDiagnosticCenter")
    public ResponseEntity<DiagnosticCenter> addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) throws Exception {
        try {
        	healthcarevalidation.validateObject(diagnosticCenter);
            return new ResponseEntity<DiagnosticCenter>(idiagnosticcenterservice.addDiagnosticCenter(diagnosticCenter),HttpStatus.OK);
        } catch ( DiagnosticCenterNotFoundException exception) {
            LOGGER.error(ADD_DIAGNOSTICCENTERS_ERROR, diagnosticCenter.toString(), exception);
            return new ResponseEntity<DiagnosticCenter>(idiagnosticcenterservice.addDiagnosticCenter(diagnosticCenter),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@GetMapping("/allDiagnosticCenters")
	public ResponseEntity<List<DiagnosticCenter>> viewAllDiagnosticCenters() {
		try {
			healthcarevalidation.validateObject(viewAllDiagnosticCenters());
			return new ResponseEntity<List<DiagnosticCenter>>(idiagnosticcenterservice.getAllDiagnosticCenters(), HttpStatus.OK);
		} catch ( DiagnosticCenterNotFoundException exception) {
			LOGGER.error( RETRIEVE_ALLDIAGN0STICCENTERS_ERROR,viewAllDiagnosticCenters(), exception);
			return new ResponseEntity(RETRIEVE_ALLDIAGN0STICCENTERS_ERROR,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/view/{DiagnosticCenterById}")
	public ResponseEntity<DiagnosticCenter> viewDiagnosticCenter(@PathVariable("DiagnosticCenterById") long diagnosticCenterById) {
		try {
			 healthcarevalidation.validateObject(diagnosticCenterById);
			return new ResponseEntity<DiagnosticCenter>(idiagnosticcenterservice.getDiagnosticCenterById(diagnosticCenterById), HttpStatus.OK);
		} catch ( DiagnosticCenterNotFoundException exception) {
			LOGGER.error(RETRIEVE_DIAGNOSTICCENTERBYID_ERROR,diagnosticCenterById , exception);
			return new ResponseEntity(RETRIEVE_DIAGNOSTICCENTERBYID_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/updateDiagnosticCenter")
    public ResponseEntity<DiagnosticCenter>updateDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) throws Exception {
        try {
        	healthcarevalidation.validateObject(diagnosticCenter);
            return new ResponseEntity<DiagnosticCenter>(idiagnosticcenterservice.updateDiagnosticCenter(diagnosticCenter),HttpStatus.OK);
        } catch ( DiagnosticCenterNotFoundException exception) {
            LOGGER.error(UPDATE_DIAGNOSTICCENTERS_ERROR, diagnosticCenter.toString(), exception);
            return new ResponseEntity<DiagnosticCenter>(idiagnosticcenterservice.updateDiagnosticCenter(diagnosticCenter),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	@GetMapping("/view/{DiagnosticCenterByCentername}")
	public ResponseEntity<DiagnosticCenter> viewDiagnosticCenterByCentername(@PathVariable("DiagnosticCenterByCentername") String centername) {
		try {
			 healthcarevalidation.validateObject(centername);
			return new ResponseEntity<DiagnosticCenter>(idiagnosticcenterservice.getDiagnosticCenter(centername), HttpStatus.OK);
		} catch ( DiagnosticCenterNotFoundException exception) {
			LOGGER.error(RETRIEVE_DIAGNOSTICCENTER_ERROR ,centername, exception);
			return new ResponseEntity(RETRIEVE_DIAGNOSTICCENTER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/removeDiagnosticCenterById")
	public ResponseEntity<DiagnosticCenter> removeDiagnosticCenterById(@PathVariable("DiagnosticCenterById") long id) {
		try {
			 healthcarevalidation.validateObject(id);
			return new ResponseEntity<DiagnosticCenter>(idiagnosticcenterservice.removeDiagnosticCenter(id), HttpStatus.OK);
		} catch ( DiagnosticCenterNotFoundException exception) {
			LOGGER.error(REMOVE_DIAGNOSTICCENTER_ERROR ,id, exception);
			return new ResponseEntity(REMOVE_DIAGNOSTICCENTER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
