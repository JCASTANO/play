package co.com.sura.integrator.module;
import com.google.inject.AbstractModule;

import co.com.sura.integrator.acl.facade.CompanyFacade;
import co.com.sura.integrator.acl.service.CompanyAclServiceImpl;
import co.com.sura.integrator.acl.translator.CompanyTranslator;
import co.com.sura.integrator.domain.workplan.applicationservice.CompanyApplicationService;
import co.com.sura.integrator.domain.workplan.repository.CompanyRepository;

public class ApplicationServiceModule extends AbstractModule {

    @Override
    public void configure() {
    	bind(CompanyApplicationService.class).toInstance(createCompanyApplicationService());
    }

	private CompanyApplicationService createCompanyApplicationService() {
		return new CompanyApplicationService(createCompanyRepository());
	}

	private CompanyRepository createCompanyRepository() {
		return new CompanyRepository(createCompanyAclService());
	}

	private CompanyAclServiceImpl createCompanyAclService() {
		return new CompanyAclServiceImpl(new CompanyFacade(),new CompanyTranslator());
	}
}
