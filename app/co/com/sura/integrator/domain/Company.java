package co.com.sura.integrator.domain;

public class Company {

	private String name;
	private String documentType;
	private String documentNumber;
	
	public Company(String name, String documentType, String documentNumber) {
		this.name = name;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDocumentType() {
		return documentType;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
}
