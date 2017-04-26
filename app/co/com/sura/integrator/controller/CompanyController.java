package co.com.sura.integrator.controller;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.com.sura.integrator.domain.service.CompanyService;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

@Singleton
public class CompanyController extends Controller {

    private final CompanyService companyService;

    @Inject
    public CompanyController(CompanyService companyService) {
       this.companyService = companyService;
    }

    public Result getByIdentification(String documentType,String documentNumber) {
        return ok(
        		Json.toJson(companyService.getByIdentification(documentType, documentNumber))
        );
    }
}
