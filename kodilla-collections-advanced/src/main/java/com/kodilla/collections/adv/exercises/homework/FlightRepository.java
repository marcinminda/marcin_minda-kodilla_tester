package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Warsaw", "Lisbon"));
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Berlin", "New York"));
        flights.add(new Flight("London", "Tokyo"));
        flights.add(new Flight("New York", "Warsaw"));

        return flights;
    }
}
