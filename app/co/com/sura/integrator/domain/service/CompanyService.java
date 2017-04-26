package co.com.sura.integrator.domain.service;

import co.com.sura.integrator.domain.Company;

public interface CompanyService {

	/**
	 * Allows to consult a company by identification
	 * @return
	 */
	Company getByIdentification(String documentType, String documentNumber);
}