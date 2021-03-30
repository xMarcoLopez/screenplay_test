package com.vivaair.screenplay.tasks;

import com.vivaair.screenplay.userinterface.FlightResultPage;
import com.vivaair.screenplay.util.Util;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.vivaair.screenplay.userinterface.ExtrasPage.NO_THANKS_SEAT_BUTTON;
import static com.vivaair.screenplay.userinterface.FlightResultPage.A_LA_CARTA_BUTTON;
import static com.vivaair.screenplay.userinterface.FlightResultPage.CONTINUE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectAFlight implements Task {
    private List<WebElement> flights;

    public SelectAFlight() {
    }

    public SelectAFlight(List<WebElement> flights) {
        this.flights = flights;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        FlightResultPage flightResultPage = new FlightResultPage();
        this.flights= driver.findElements(By.className("from-price"));
        WebElement cheapestFlightElement = Util.getCheapestFlight(flights);
        cheapestFlightElement.click();
        actor.attemptsTo(
                WaitUntil.the(A_LA_CARTA_BUTTON, isVisible()),
                MoveMouse.to(A_LA_CARTA_BUTTON),
                Click.on(A_LA_CARTA_BUTTON),
                JavaScriptClick.on(CONTINUE_BUTTON),
                WaitUntil.the(NO_THANKS_SEAT_BUTTON, isVisible()).forNoMoreThan(5).seconds()
        );
    }

    public static SelectAFlight betweenTheResults(){
        return instrumented(SelectAFlight.class);
    }
}
