package com.vivaair.screenplay.stepdefinitions;

import com.vivaair.screenplay.model.Flight;
import com.vivaair.screenplay.tasks.PickTheExtras;
import com.vivaair.screenplay.tasks.SearchAFlight;
import com.vivaair.screenplay.tasks.SelectAFlight;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchFlightStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to search for flights$")
    public void goToSearchFlights(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url("https://vivaair.com"));
    }


    @When("^Daniel enters departure (.*) and destination (.*)$")
    public void searchFlights(String departure, String destination) {
        theActorInTheSpotlight().attemptsTo(SearchAFlight.with(new Flight(departure, destination)));
        theActorInTheSpotlight().attemptsTo(SelectAFlight.betweenTheResults());
        theActorInTheSpotlight().attemptsTo(PickTheExtras.inTheExtrasPage());
    }

    @Then("^Daniel should pick the cheapest flight$")
    public void shouldSeeTheExtrasPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
