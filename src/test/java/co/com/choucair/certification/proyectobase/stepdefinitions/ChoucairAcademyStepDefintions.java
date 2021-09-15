package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.Question.Answer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.proyectobase.Tasks.Login;
import co.com.choucair.certification.proyectobase.Tasks.OpenUp;
import co.com.choucair.certification.proyectobase.Tasks.Search;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn to learn automation at the academy choucair$")
    public void thanBrandonWantsToLearnToLearnAutomationAtTheAcademyChoucair() throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
        OnStage.theActorCalled("Brandon").wasAbleTo(Login.onthePage());

    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseCursoBDDDesarrolloGuiadoPorPruebasOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesCursoBDDDesarrolloGuiadoPorPruebas(String question){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));



    }

}
