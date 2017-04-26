package co.com.sura.integrator.domain.workplan.service;

import co.com.sura.integrator.domain.workplan.Company;
import co.com.sura.integrator.domain.workplan.repository.CompanyRepository;

public class CompanyService {

	private CompanyRepository companyRepository;
	
	public CompanyService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public Company getByIdentification(String documentType,String documentNumber) {
		return companyRepository.getByIdentification(documentType, documentNumber);
	}
}