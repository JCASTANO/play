package co.com.sura.integrator.acl.translator;

import co.com.sura.integrator.acl.entity.CompanyEntity;
import co.com.sura.integrator.domain.workplan.Company;

public class CompanyTranslator {

	public Company translate(CompanyEntity companyEntity) {
		return new Company(companyEntity.getName(), companyEntity.getDocumentType(), companyEntity.getDocumentNumber());
	}
}
