package com.vivaair.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheExtrasPage implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }

    @Override
    public String getSubject(){
        return "the extras page is visible";
    }
}
