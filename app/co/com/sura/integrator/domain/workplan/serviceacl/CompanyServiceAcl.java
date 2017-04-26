package co.com.sura.integrator.domain.workplan.serviceacl;

import co.com.sura.integrator.domain.workplan.Company;

public interface CompanyServiceAcl {

	Company getByIdentification(String documentType,String documentNumber);
}
