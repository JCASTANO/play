package co.com.sura.integrator.openpages;

import co.com.sura.integrator.domain.Company;
import co.com.sura.integrator.domain.repository.CompanyRepository;

public class OpenPagesCompanyRepository implements CompanyRepository {

	@Override
	public Company getByIdentification(String documentType, String documentNumber) {
		return new Company("My company", "NIT", "0123456789");
	}
}
