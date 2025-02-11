package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTest {
    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();


        // when
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");

        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Lisbon"));
        expectedList.add(new Flight("Warsaw", "London"));
//        expectedList.add(new Flight("Warsaw", "Berlin"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> result1 = flightFinder.findFlightsTo("Warsaw");

        // then
        List<Flight> expectedList1 = new ArrayList<>();
        expectedList1.add(new Flight("New York", "Warsaw"));
//        expectedList1.add(new Flight("Warsaw", "London"));
        assertEquals(expectedList1, result1);
    }

}