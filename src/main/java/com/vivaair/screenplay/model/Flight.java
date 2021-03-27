package com.vivaair.screenplay.model;

import com.vivaair.screenplay.util.Util;

public class Flight {
    private final String departure;
    private final String destination;
    private final String departureDate;

    public Flight(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
        this.departureDate = Util.generateNextDayDate();
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }
}
