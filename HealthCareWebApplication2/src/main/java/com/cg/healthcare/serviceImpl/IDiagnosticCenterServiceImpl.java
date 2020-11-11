package com.cg.healthcare.serviceImpl;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import static com.cg.healthcare.constants.DiagnosticCenterConstants.*;

import com.cg.healthcare.entity.DiagnosticCenter;
import com.cg.healthcare.exception.DiagnosticCenterNotFoundException;
import com.cg.healthcare.repository.IDiagnosticCenterRepository;
import com.cg.healthcare.service.IDiagnosticCenterService;


/**
 * IDiagnosticCenterServiceImpl class implements IDiagnosticCenterService interface methods
 * 
 * @author Rishab Saxena(alias)
 * @version 1.0
 * @date 11/06/2020
 *
 */

@Component
public class IDiagnosticCenterServiceImpl implements IDiagnosticCenterService {

	@Autowired
	private IDiagnosticCenterRepository dao;
	private static final Logger LOGGER = LoggerFactory.getLogger(IDiagnosticCenterServiceImpl.class);
	

	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() {
		return dao.findAll();
	}

	

	
	
	@Override
	public DiagnosticCenter getDiagnosticCenterById(long diagnosticCenterId) {
		DiagnosticCenter diagnosticcenter= dao.findbyDiagnosticCenterById(diagnosticCenterId);
		return diagnosticcenter;
		
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		DiagnosticCenter diagnosticcenter=dao.save(diagnosticCenter);
		return diagnosticcenter;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenter(String centername) {
		DiagnosticCenter diagnosticcenter=dao.findByBuildingName(centername);
		return diagnosticcenter ;
	}

	@Override
	
	public DiagnosticCenter removeDiagnosticCenter(long id) throws DiagnosticCenterNotFoundException {
		dao.deleteById(id);
		return (DiagnosticCenter)dao.findAll();
	}
	@Override
    public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticcenter) throws DiagnosticCenterNotFoundException {
            LOGGER.info( ADD_DIAGNOSTICCENTERS_INPUT, diagnosticcenter.toString());
            DiagnosticCenter savedDiagnosticCenter = dao.save( diagnosticcenter);
            if(savedDiagnosticCenter!=null) {
            LOGGER.info(ADD_DIAGNOSTICCENTERS_SUCCESS, diagnosticcenter.toString());
            }
            else {
            throw new DiagnosticCenterNotFoundException(String.format(ADD_DIAGNOSTICCENTERS_DAO_ERROR, diagnosticcenter .toString()));
        }
            return savedDiagnosticCenter;
	}

	
}



