package co.com.sura.integrator.domain.repository;

import co.com.sura.integrator.domain.Company;

public interface CompanyRepository {

	/**
	 * Allows to consult a company by identification
	 * @return
	 */
	public Company getByIdentification(String documentType,String documentNumber);
}
