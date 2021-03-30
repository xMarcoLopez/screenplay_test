package com.vivaair.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExtrasPage {

    public static final Target NO_THANKS_SEAT_BUTTON = Target.the("No thanks seat button").located(By.xpath("/html/body/div[1]/div[4]/div[3]/div[1]/div/div[2]/div/div[1]/div[4]/div/div[2]/div/div/div/div[5]/div[2]/div[3]/div[1]/button"));
    public static final Target CONFIRM_NO_SEAT_BUTTON = Target.the("Confirm no seat button").located(By.xpath("/html/body/div[1]/div[4]/div[3]/div[1]/div/div[2]/div/div[1]/div[4]/div/div[2]/div/div/div/div[5]/div[2]/div[3]/div[1]/button"));
    public static final Target NO_THANKS_BAGGAGE_BUTTON = Target.the("No thanks baggage button").located(By.xpath("/html/body/div[1]/div[4]/div[3]/div[1]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[3]/div[2]/button"));

}
