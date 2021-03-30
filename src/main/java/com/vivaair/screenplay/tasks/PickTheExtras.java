package com.vivaair.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.vivaair.screenplay.userinterface.ExtrasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PickTheExtras implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NO_THANKS_SEAT_BUTTON),
                Click.on(CONFIRM_NO_SEAT_BUTTON),
                WaitUntil.the(NO_THANKS_BAGGAGE_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NO_THANKS_BAGGAGE_BUTTON)
        );
    }

    public static PickTheExtras inTheExtrasPage(){
        return instrumented(PickTheExtras.class);
    }
}
