package co.com.sura.integrator.module;
import com.google.inject.AbstractModule;

import co.com.sura.integrator.acl.facade.CompanyFacade;
import co.com.sura.integrator.acl.service.CompanyServiceAclImpl;
import co.com.sura.integrator.acl.translator.CompanyTranslator;
import co.com.sura.integrator.domain.workplan.repository.CompanyRepository;
import co.com.sura.integrator.domain.workplan.service.CompanyService;

public class ServiceModule extends AbstractModule {

    @Override
    public void configure() {
    	bind(CompanyService.class).toInstance(createCompanyService());
    }

	private CompanyService createCompanyService() {
		return new CompanyService(createCompanyRepository());
	}

	private CompanyRepository createCompanyRepository() {
		return new CompanyRepository(createCompanyServiceAcl());
	}

	private CompanyServiceAclImpl createCompanyServiceAcl() {
		return new CompanyServiceAclImpl(new CompanyFacade(),new CompanyTranslator());
	}
}
