package co.com.sura.integrator.controller;

import javax.inject.Inject;
import javax.inject.Singleton;

import co.com.sura.integrator.domain.workplan.applicationservice.CompanyApplicationService;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

@Singleton
public class CompanyController extends Controller {

    private CompanyApplicationService companyApplicationService;

    @Inject
    public CompanyController(CompanyApplicationService companyApplicationService) {
       this.companyApplicationService = companyApplicationService;
    }

    public Result getByIdentification(String documentType,String documentNumber) {
        return ok(
        		Json.toJson(companyApplicationService.getByIdentification(documentType, documentNumber))
        );
    }
}
