package com.cg.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.healthcare.entity.DiagnosticCenter;

/**
 * IDiagnosticCenterRepository interface is used to call database request related to DiagnosticCenters
 * 
 * 
 * @author Rishab Saxena(alias)
 * @version 1.0
 * @date 11/06/2020
 *
 */
@Repository
public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter,Long> {

		public DiagnosticCenter findByBuildingName(String buildingName);
		public DiagnosticCenter findbyAddressId(long AddressId);
		public DiagnosticCenter findbyDiagnosticCenterById(long diagnosticCenterId);
	
}
