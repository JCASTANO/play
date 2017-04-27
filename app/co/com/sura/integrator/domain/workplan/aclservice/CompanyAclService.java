package co.com.sura.integrator.domain.workplan.aclservice;

import co.com.sura.integrator.domain.workplan.Company;

public interface CompanyAclService {

	Company getByIdentification(String documentType,String documentNumber);
}
