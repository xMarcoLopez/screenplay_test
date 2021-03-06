package com.vivaair.screenplay.util;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Util {

    public static String generateNextDayDate() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date currentDate = Date.from(LocalDate.now().plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        String date = simpleDateFormat.format(currentDate);
        return date;
    }

    public static List<String> getTextList(List<WebElement> list){
        List <String> textList = new ArrayList<String>();
        for (WebElement webElement : list){
            textList.add(webElement.getText());
        }
        return textList;
    }

    public static List<String> removeCharacter(List<String> list, String character){
        List <String> newList = new ArrayList<String>();
        for(String text : list){
            newList.add(text.replaceAll(character, ""));
        }
        return newList;
    }

    public static List<String>removeCharacters(List<String> list){
        List <String> newList = new ArrayList<String>();
        newList = removeCharacter(list, "COP");
        newList = removeCharacter(newList, ",");
        newList = removeCharacter(newList, " ");
        return newList;
    }

    public static List<Integer> convertStringListToIntegerList(List<String> list){
        List <Integer> newList = new ArrayList<Integer>();
        for(String text : list){
            newList.add(Integer.parseInt(text));
        }
        return newList;
    }

    public static WebElement getCheapestFlight(List<WebElement> flightPrices){
        List<Integer> flightPricesCOP = null;
        Integer cheapestFlight = null;
        WebElement cheapestFlightElement;
        List<String> textFlightPrices = getTextList(flightPrices);
        textFlightPrices = removeCharacters(textFlightPrices);
        flightPricesCOP = convertStringListToIntegerList(textFlightPrices);
        cheapestFlight = Collections.min(flightPricesCOP);
        cheapestFlightElement = flightPrices.get(flightPricesCOP.indexOf(cheapestFlight));
       return cheapestFlightElement;
    }
}
