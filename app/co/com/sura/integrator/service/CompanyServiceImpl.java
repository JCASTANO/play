package co.com.sura.integrator.service;

import com.google.inject.Inject;

import co.com.sura.integrator.domain.Company;
import co.com.sura.integrator.domain.repository.CompanyRepository;
import co.com.sura.integrator.domain.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
	
	private CompanyRepository companyRepository;
	
	@Inject
	public CompanyServiceImpl(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	@Override
	public Company getByIdentification(String documentType,String documentNumber) {
		return companyRepository.getByIdentification(documentType, documentNumber);
	}
}
