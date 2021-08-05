package co.com.choucair.certification.RetoTecnicoBancolombia5.stepdefinitions;

import co.com.choucair.certification.RetoTecnicoBancolombia5.model.BancolombiaData;
import co.com.choucair.certification.RetoTecnicoBancolombia5.questions.AnswerInformeEconomicoMensual;
import co.com.choucair.certification.RetoTecnicoBancolombia5.tasks.OpenUp;
import co.com.choucair.certification.RetoTecnicoBancolombia5.tasks.SearchInformeEconomico;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class InformeEconomicoMensualDocumentStepDefinitions {

    @Before
    public void setStage(){ setTheStage(new OnlineCast());}

    @Given("^than Jorge want to search the Informe Economico mensual$")
    public void thanJorgeWantToSearchTheInformeEconomicoMensual() {
        theActorCalled("Jorge").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search for the document$")
    public void heSearchForTheDocument(){
        theActorInTheSpotlight().attemptsTo(SearchInformeEconomico.theInfo());
    }

    @Then("^he finds the PDF document about Informe Economico Mensual$")
    public void heFindsThePDFDocumentAboutInformeEconomicoMensual(List<BancolombiaData> bancolombiaData) {
        theActorInTheSpotlight().should(seeThat(AnswerInformeEconomicoMensual.toThe(bancolombiaData.get(0))));
    }
}
