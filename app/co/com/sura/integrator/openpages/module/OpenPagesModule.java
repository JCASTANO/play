package co.com.sura.integrator.openpages.module;
import com.google.inject.AbstractModule;

import co.com.sura.integrator.domain.repository.CompanyRepository;
import co.com.sura.integrator.openpages.OpenPagesCompanyRepository;

public class OpenPagesModule extends AbstractModule {

    @Override
    public void configure() {
    	bind(CompanyRepository.class).to(OpenPagesCompanyRepository.class);
    }
}
