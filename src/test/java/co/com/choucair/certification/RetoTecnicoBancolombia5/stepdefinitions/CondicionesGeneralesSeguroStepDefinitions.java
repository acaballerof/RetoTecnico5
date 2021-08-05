package co.com.choucair.certification.RetoTecnicoBancolombia5.stepdefinitions;

import co.com.choucair.certification.RetoTecnicoBancolombia5.model.BancolombiaData;
import co.com.choucair.certification.RetoTecnicoBancolombia5.questions.AnswerCondicoinesGeneralesSeguro;
import co.com.choucair.certification.RetoTecnicoBancolombia5.tasks.OpenUp;
import co.com.choucair.certification.RetoTecnicoBancolombia5.tasks.SearchCondicionesGenerales;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CondicionesGeneralesSeguroStepDefinitions {

    @Before
    public void setStage() { setTheStage(new OnlineCast()); }

    @Given("^than Jorge want to search for the condiciones generales de seguro de vida$")
    public void thanJorgeWantToSearchForTheCondicionesGeneralesDeSeguroDeVida()  {
        theActorCalled("Jorge").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search for the documents$")
    public void heSearchForTheDocuments()  {
        theActorInTheSpotlight().attemptsTo(SearchCondicionesGenerales.toThe());
    }

    @Then("^he finds the PDF document about Condiciones Generales de seguro de vida$")
    public void heFindsThePDFDocumentAboutCondicionesGeneralesDeSeguroDeVida(List<BancolombiaData> bancolombiaData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCondicoinesGeneralesSeguro.toThe(bancolombiaData.get(0))));
    }
}
