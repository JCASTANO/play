package co.com.sura.integrator.domain.workplan.applicationservice;

import co.com.sura.integrator.domain.workplan.Company;
import co.com.sura.integrator.domain.workplan.repository.CompanyRepository;

public class CompanyApplicationService {

	private CompanyRepository companyRepository;
	
	public CompanyApplicationService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public Company getByIdentification(String documentType,String documentNumber) {
		return companyRepository.getByIdentification(documentType, documentNumber);
	}
}