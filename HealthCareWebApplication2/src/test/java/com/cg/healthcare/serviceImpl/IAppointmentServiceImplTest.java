package com.cg.healthcare.serviceImpl;

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

import com.cg.healthcare.entity.Appointment;
import com.cg.healthcare.exception.AppointmentNotFoundException;
import com.cg.healthcare.repository.IAppointmentRepository;

 

@RunWith(MockitoJUnitRunner.class)
public class IAppointmentServiceImplTest {

 

    @Mock
    private IAppointmentRepository iappointmentRepo;
    @InjectMocks
    private IAppointmentServiceImpl iappointmentServiceImpl;

 

    @Test
    public void testaddAppointment() throws Exception {

 

    	Appointment expObj=new Appointment(101,2020-11-11,"approved","RBC","Karan","Lal Pathlab","Positive");
        
        Mockito.when(iappointmentRepo.save(Mockito.any())).thenReturn(expObj);
        
        Appointment obj1 = iappointmentServiceImpl.addAppointment(obj);

 

        assertEquals(obj1,obj);
    }

 

    @Test(expected=AppointmentNotFoundException.class)
    
    public void testaddAppointmentException() throws Exception {
        
  when(iappointmentRepo.save(Mockito.anyObject())).thenThrow(new AppointmentNotFoundException());
  
  iappointmentServiceImpl.addAppointment(new Appointment()); 
    }    
}
