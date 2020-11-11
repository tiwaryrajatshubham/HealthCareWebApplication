package com.cg.healthcare.app;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.cg.healthcare.entities.DiagnosticCenter;
import com.cg.healthcare.exception.DiagnosticCenterNotFoundException;
import com.cg.healthcare.repository.IDiagnosticCenterRepository;
import com.cg.healthcare.serviceImpl.IDiagnosticCenterServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class IDiagnosticCenterTest {

	@Mock
	private IDiagnosticCenterRepository idiagnosticRepo;
	@InjectMocks
	private IDiagnosticCenterServiceImpl idiagnosticServiceImpl;
	
//Test Add Diagnostic Center
	@Test
	public void testaddDiagnosticCenter() throws Exception {

		DiagnosticCenter obj = new DiagnosticCenter(1, "ITS Center", "Vaishali", "410", "NewYork", "NewYork", "USA",
				"201012");

		Mockito.when(idiagnosticRepo.save(obj)).thenReturn(obj);

		DiagnosticCenter obj1 = idiagnosticServiceImpl.addDiagnosticCenter(obj);

		assertEquals(obj1, obj);
	}

	@Test(expected = DiagnosticCenterNotFoundException.class)

	public void testaddDiagnosticCenterException() throws Exception {

		when(idiagnosticRepo.save(Mockito.anyObject())).thenThrow(new DiagnosticCenterNotFoundException());

		idiagnosticServiceImpl.addDiagnosticCenter(new DiagnosticCenter());
	}

	//Test to get Diagnostic Center
	  
	@Test
	public void testgetDiagnosticCenter() {

		Mockito.when(idiagnosticRepo.findAll())
				.thenReturn(Stream.of(
						new DiagnosticCenter(1, "ITS Center", "Vaishali", "410", "NewYork", "NewYork", "USA", "201012"),
						new DiagnosticCenter(2, "IRS Center", "Indirapuram", "420", "Ghaziabad", "UttarPradesh",
								"India", "201013"))
						.collect(Collectors.toList()));

		assertEquals(2, idiagnosticServiceImpl.getAllDiagnosticCenters().size());
	}

	// Test to update Diagnostic Center
		

		@Test
		public void testupdateDiagnosticCenter() throws Exception {

			DiagnosticCenter obj = new DiagnosticCenter(1, "QBZ Center", "Vaishali", "410", "NewYork", "NewYork", "USA",
					"201012");
			Mockito.when(idiagnosticRepo.save(Mockito.any(DiagnosticCenter.class))).thenReturn(obj);
			DiagnosticCenter obj1 = idiagnosticServiceImpl.updateDiagnosticCenter(obj);
			assertEquals(obj.getAddressId(), obj1.getAddressId());
		}
	// Test to remove Diagnostic Center
 
		@Test
		public void testremoveDiagnosticCenter() throws Exception {

			DiagnosticCenter obj = new DiagnosticCenter(1, "ITS Center", "Vaishali", "410", "NewYork", "NewYork", "USA",
					"201012");

		Mockito.when(idiagnosticRepo.findById(obj.getAddressId())).thenReturn(null);
			 idiagnosticServiceImpl.removeDiagnosticCenter(1);
			assertEquals(null, idiagnosticServiceImpl.removeDiagnosticCenter(1));
		}
	}
	    


	







