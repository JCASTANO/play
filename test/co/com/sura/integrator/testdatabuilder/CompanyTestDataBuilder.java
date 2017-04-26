package co.com.sura.integrator.testdatabuilder;

import co.com.sura.integrator.domain.workplan.Company;

public class CompanyTestDataBuilder {
	
	private String name;
	private String documentType;
	private String documentNumber;

	public CompanyTestDataBuilder() {
		this.name = "My company";
		this.documentType = "NIT";
		this.documentNumber = "0123456789";
	}

	public CompanyTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public CompanyTestDataBuilder withDocumentType(String documentType) {
		this.documentType = documentType;
		return this;
	}

	public CompanyTestDataBuilder withDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
		return this;
	}

	public Company build() {
		return new Company(this.name, this.documentType, this.documentNumber);
	}
}
