package com.healthcare.service;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Optional;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.exception.*;
import com.healthcare.repository.*;
import com.healthcare.service.IPatientService;
import com.healthcare.serviceImpl.IPatientServiceImpl;
import com.healthcare.entity.*;
 

@RunWith(MockitoJUnitRunner.class)
public class IPatientServiceImplTest {

 

    @Mock
    private IPatientRepository ipatientRepo;
    @InjectMocks
    private IPatientServiceImpl ipatientServiceImpl;
    
    
    @Test
	public void testregisterPatient() {

    	Patient patientObj=new Patient(9,"Aman","9490",20, "male", null);
	
		Mockito.when(ipatientRepo.save(patientObj)).thenReturn(patientObj);
		Patient patientObj1 = ipatientServiceImpl.registerPatient(patientObj);
	
		assertEquals(patientObj1,patientObj);
		
	}
    @Test(expected = PatientNotFoundException.class)
	public void testregisterPatientException() throws Exception {
		when(ipatientRepo.save(Mockito.anyObject())).thenThrow(new PatientNotFoundException());
		ipatientServiceImpl.registerPatient(new Patient());
	}
    
    
    @Test
	public void testupdatePatientDetails() {

    	Patient patientObj=new Patient(9,"Aman","9490",20, "male", null);
	
		Mockito.when(ipatientRepo.save(patientObj)).thenReturn(patientObj);
		Patient patientObj1 = ipatientServiceImpl.updatePatientDetails(patientObj);
	
		assertEquals(patientObj1,patientObj);
		
	}
    @Test(expected = PatientNotFoundException.class)
	public void testupdatePatientDetailsException() throws Exception {
		when(ipatientRepo.save(Mockito.anyObject())).thenThrow(new PatientNotFoundException());
		ipatientServiceImpl.updatePatientDetails(new Patient());
	}
    
    @Test
   	public void testviewPatient() {

       	Patient patientObj=new Patient(9,"Aman","9490",20, "male", null);
   	
   		Mockito.when(ipatientRepo.viewPatient(patientObj)).thenReturn(patientObj);
   		Patient patientObj1 = ipatientServiceImpl.viewPatient(patientObj);
   	
   		assertEquals(patientObj1,patientObj);
   		
   	}
       @Test(expected = PatientNotFoundException.class)
   	public void testviewPatientException() throws Exception {
   		when(ipatientRepo.save(Mockito.anyObject())).thenThrow(new PatientNotFoundException());
   		ipatientServiceImpl.viewPatient(new Patient());
   	}
       

    
}