package co.com.sura.integrator.acl.service;

import co.com.sura.integrator.acl.entity.CompanyEntity;
import co.com.sura.integrator.acl.facade.CompanyFacade;
import co.com.sura.integrator.acl.translator.CompanyTranslator;
import co.com.sura.integrator.domain.workplan.Company;
import co.com.sura.integrator.domain.workplan.aclservice.CompanyAclService;

public class CompanyAclServiceImpl implements CompanyAclService {
	
	private CompanyFacade companyFacade;
	private CompanyTranslator companyTranslator;
	
	public CompanyAclServiceImpl(CompanyFacade companyFacade,CompanyTranslator companyTranslator) {
		this.companyFacade = companyFacade;
		this.companyTranslator = companyTranslator;
	}

	@Override
	public Company getByIdentification(String documentType, String documentNumber) {
		CompanyEntity companyEntity = companyFacade.getByIdentification(documentType, documentNumber);
		return companyTranslator.translate(companyEntity);
	}
}
