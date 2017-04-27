package co.com.sura.integrator.domain.workplan.repository;

import co.com.sura.integrator.domain.workplan.Company;
import co.com.sura.integrator.domain.workplan.aclservice.CompanyAclService;

public class CompanyRepository {
	
	private CompanyAclService companyAclService;
	
	public CompanyRepository(CompanyAclService companyAclService) {
		this.companyAclService = companyAclService;
	}

	public Company getByIdentification(String documentType, String documentNumber) {
		return this.companyAclService.getByIdentification(documentType, documentNumber);
	}
}
