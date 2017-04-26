package co.com.sura.integrator.domain;

import org.junit.Assert;
import org.junit.Test;

import co.com.sura.integrator.testdatabuilder.CompanyTestDataBuilder;

public class CompanyTest {

	@Test
	public void createValidateFieldsNotNull() {
		//Arrange
		CompanyTestDataBuilder companyTestDataBuilder = new CompanyTestDataBuilder();
		//Act
		Company company = companyTestDataBuilder.build();
		//Assert
		Assert.assertNotNull(company.getName());
		Assert.assertNotNull(company.getDocumentType());
		Assert.assertNotNull(company.getDocumentNumber());
	}
}
