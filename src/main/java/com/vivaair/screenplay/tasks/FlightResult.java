package com.vivaair.screenplay.tasks;

import com.vivaair.screenplay.userinterface.FlightResultPage;
import com.vivaair.screenplay.util.Util;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class FlightResult implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        FlightResultPage flightResultPage = new FlightResultPage();
        List<WebElementFacade> flightPrices = flightResultPage.getFlightPrices();
        WebElementFacade cheapestFlightElement = Util.getCheapestFlight(flightPrices);
        actor.attemptsTo(
                Click.on(cheapestFlightElement)
        );
    }
}
