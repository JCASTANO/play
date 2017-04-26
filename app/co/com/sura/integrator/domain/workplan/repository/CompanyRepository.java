package co.com.sura.integrator.domain.workplan.repository;

import co.com.sura.integrator.domain.workplan.Company;
import co.com.sura.integrator.domain.workplan.serviceacl.CompanyServiceAcl;

public class CompanyRepository {
	
	private CompanyServiceAcl companyServiceAcl;
	
	public CompanyRepository(CompanyServiceAcl companyServiceAcl) {
		this.companyServiceAcl = companyServiceAcl;
	}

	public Company getByIdentification(String documentType, String documentNumber) {
		return this.companyServiceAcl.getByIdentification(documentType, documentNumber);
	}
}
