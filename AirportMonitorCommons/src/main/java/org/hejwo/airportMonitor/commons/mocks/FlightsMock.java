package org.hejwo.airportMonitor.commons.mocks;

import org.hejwo.airportMonitor.commons.entities.Airport;
import org.hejwo.airportMonitor.commons.entities.Flight;
import org.hejwo.airportMonitor.commons.entities.Plane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author : Hejwo
 * @since : 2015-11-21.
 */
@Configuration
public class FlightsMock {

    @Bean
    public Flight flight1(Plane plane1, Airport warszawa1, Airport barcelona1) {
        Flight flight1 = new Flight();
        flight1.setId(1);
        flight1.setFlightId("flight_oneOne");
        flight1.setPlane(plane1);

        flight1.setStartAirport(warszawa1);
        flight1.setEndAirport(barcelona1);

        LocalTime startTime = LocalTime.now().minus(1, ChronoUnit.HOURS);
        LocalTime endTime = startTime.plus(4, ChronoUnit.HOURS);

        flight1.setStartTime(startTime);
        flight1.setEndTime(endTime);

        return flight1;
    }

    @Bean
    public Flight flight2(Plane plane2, Airport lublin1, Airport warszawa1) {
        Flight flight2 = new Flight();
        flight2.setId(1);
        flight2.setFlightId("flight_twoTwo");
        flight2.setPlane(plane2);

        flight2.setStartAirport(lublin1);
        flight2.setEndAirport(warszawa1);

        LocalTime startTime = LocalTime.now().minus(30, ChronoUnit.MINUTES);
        LocalTime endTime = startTime.plus(2, ChronoUnit.HOURS);

        flight2.setStartTime(startTime);
        flight2.setEndTime(endTime);

        return flight2;
    }

}
