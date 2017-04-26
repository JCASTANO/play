package co.com.sura.integrator.service.module;
import com.google.inject.AbstractModule;

import co.com.sura.integrator.domain.service.CompanyService;
import co.com.sura.integrator.service.CompanyServiceImpl;

public class ServiceModule extends AbstractModule {

    @Override
    public void configure() {
    	bind(CompanyService.class).to(CompanyServiceImpl.class);
    }
}
