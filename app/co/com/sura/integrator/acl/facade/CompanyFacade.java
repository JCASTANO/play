package co.com.sura.integrator.acl.facade;

import co.com.sura.integrator.acl.entity.CompanyEntity;

public class CompanyFacade {

	public CompanyEntity getByIdentification(String documentType, String documentNumber) {
		CompanyEntity companyEntity = new CompanyEntity();
		companyEntity.setId(1L);
		companyEntity.setName("My company");
		companyEntity.setDocumentType(documentType);
		companyEntity.setDocumentNumber(documentNumber);
		return companyEntity;
	}
}
