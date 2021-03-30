package com.vivaair.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class FlightResultPage extends PageObject {

    public static final Target A_LA_CARTA_BUTTON = Target.the("A la carta button").located(By.xpath("//*[@id=\"Vkh_NTU2NH4gfn5NREV_MDMvMzEvMjAyMSAwNTo1NX5CT0d_MDMvMzEvMjAyMSAwNjo1N35_\"]/div[2]/div/div/div[2]/div[1]/div/div[5]/div"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue button").located(By.xpath("/html/body/div[1]/div[4]/div[3]/div[1]/div/div[2]/div/div[3]/div[2]/button"));

    public List<WebElementFacade> getFlightPrices(){
        return findAll("//div[@class='from-price']");
    }
}
