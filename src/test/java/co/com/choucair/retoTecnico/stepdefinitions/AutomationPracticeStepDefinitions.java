package co.com.choucair.retoTecnico.stepdefinitions;

import co.com.choucair.retoTecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AutomationPracticeStepDefinitions {

    @Before public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^tan Brandon wants to learn automation at the academy Choucair$")
    public void tanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());

    }

    @When("^he search for he course Recursos Automatizacion Bancolombia on the choucair academy platform$")
    public void heSearchForHeCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {

    }


}
