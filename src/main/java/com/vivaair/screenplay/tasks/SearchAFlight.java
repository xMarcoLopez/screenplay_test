package com.vivaair.screenplay.tasks;

import com.vivaair.screenplay.model.Flight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static com.vivaair.screenplay.userinterface.SearchFlightPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchAFlight implements Task {

    private Flight flight;

    public SearchAFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ONE_WAY_CHECKBOX),
                Enter.theValue(flight.getDeparture()).into(DEPARTURE_FIELD).thenHit(Keys.ENTER),
                Enter.theValue(flight.getDestination()).into(DESTINATION_FIELD).thenHit(Keys.ENTER),
                Click.on(CALENDAR),
                JavaScriptClick.on(DEPARTURE_DATE.of(flight.getDepartureDate())),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static SearchAFlight with(Flight flight){
        return instrumented(SearchAFlight.class, flight);
    }
}
