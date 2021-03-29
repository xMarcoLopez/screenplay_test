package com.vivaair.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchFlightPage {
    public static final Target ONE_WAY_CHECKBOX = Target.the("One way checkbox").located(By.xpath("//*[@id=\"criteria\"]/div/div[1]/label/span[2]"));
    public static final Target DEPARTURE_FIELD = Target.the("Departure").located(By.id("criteria-airport-select-departure-input"));
    public static final Target DESTINATION_FIELD = Target.the("Destination").located(By.id("criteria-airport-select-destination-input"));
    public static final Target CALENDAR = Target.the("Calendar").located(By.id("criteria-dates-from"));
    public static final Target DEPARTURE_DATE = Target.the("Departure date").locatedBy("//button[@date='{0}']");
    public static final Target SEARCH_BUTTON = Target.the("Search button").located(By.id("criteria-search-button-desktop"));
}
