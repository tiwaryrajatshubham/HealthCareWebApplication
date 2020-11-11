
package com.cg.healthcare.service;
import java.util.List;


import org.springframework.stereotype.Service;

import com.cg.healthcare.entity.DiagnosticCenter;
import com.cg.healthcare.exception.DiagnosticCenterNotFoundException;

/** IDiagnosticCenterService interface is used to call database related to DiagnosticCenters
 * @author Rishab Saxena(alias)
 * @version 1.0
 * @date 11/06/2020
 *
 */

@Service

public interface IDiagnosticCenterService {

	public List<DiagnosticCenter> getAllDiagnosticCenters();
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws Exception;
	DiagnosticCenter getDiagnosticCenterById(long diagnosticCenterId);
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	DiagnosticCenter getDiagnosticCenter(String centername);
	
	DiagnosticCenter removeDiagnosticCenter(long id) throws DiagnosticCenterNotFoundException;
	
}



