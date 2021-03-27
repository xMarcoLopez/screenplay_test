package com.vivaair.screenplay.tasks;

import com.vivaair.screenplay.model.Flight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.vivaair.screenplay.userinterface.SearchFlightPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFlight implements Task {

    private Flight flight;

    public SearchFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ONE_WAY_CHECKBOX),
                Enter.theValue(flight.getDeparture()).into(DEPARTURE_FIELD),
                Enter.theValue(flight.getDestination()).into(DESTINATION_FIELD),
                Click.on(CALENDAR),
                Click.on(DEPARTURE_DATE.of(flight.getDepartureDate())),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static SearchFlight with(Flight flight){
        return instrumented(SearchFlight.class, flight);
    }
}
