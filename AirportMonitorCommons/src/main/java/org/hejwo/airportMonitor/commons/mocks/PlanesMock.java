package org.hejwo.airportMonitor.commons.mocks;

import org.hejwo.airportMonitor.commons.entities.Airline;
import org.hejwo.airportMonitor.commons.entities.Plane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Hejwo
 * @since : 2015-11-21.
 */
@Configuration
public class PlanesMock {

    @Bean
    public Plane plane1() {
        Plane plane1 = new Plane();
        plane1.setId(1);
        plane1.setPlaneId("oneone");
        plane1.setAirline(Airline.NORWEGIAN);
        plane1.setCapacity(90);

        return plane1;
    }

    @Bean
    public Plane plane2() {
        Plane plane2 = new Plane();
        plane2.setId(2);
        plane2.setPlaneId("twotwo");
        plane2.setAirline(Airline.LOT);
        plane2.setCapacity(120);

        return plane2;
    }

}
