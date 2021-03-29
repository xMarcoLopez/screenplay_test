package com.vivaair.screenplay.tasks;

import com.vivaair.screenplay.userinterface.FlightResultPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

public class FlightResult implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        FlightResultPage flightResultPage = new FlightResultPage();
        List<WebElementFacade> flightPrices = flightResultPage.getFlightPrices();

        actor.attemptsTo(

        );
    }
}
