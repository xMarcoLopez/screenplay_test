package com.vivaair.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class FlightResultPage extends PageObject {

    public List<WebElementFacade> getFlightPrices(){
        return findAll("//div[@class='from-price']");
    }
}
