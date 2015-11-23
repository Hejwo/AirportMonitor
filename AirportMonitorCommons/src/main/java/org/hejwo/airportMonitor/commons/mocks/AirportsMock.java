package org.hejwo.airportMonitor.commons.mocks;

import org.hejwo.airportMonitor.commons.entities.Airport;
import org.hejwo.airportMonitor.commons.entities.City;
import org.hejwo.airportMonitor.commons.entities.Location;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@Configuration
public class AirportsMock {

	@Bean
	public Airport barcelona1(City barcelona) {
		return new Airport(1, "Barcelona El Prat", "08820 El Prat de Llobregat, Barcelona, Hiszpania", barcelona, new Location(0,950));
	}

	@Bean
	public Airport barcelona2(City barcelona) {
		return new Airport(2, "Barcelona Puta Madre", " 21241 de Llobregat, Barcelona, Hiszpania", barcelona, null);
	}

	@Bean
	public Airport warszawa1(City warszawa) {
		return new Airport(3, "Warszawa Okęcie", "ul. Lotnicza 1, Warszawa, Hiszpania", warszawa, new Location(0,0));
	}

	@Bean
	public Airport lublin1(City lublin) {
		return new Airport(4, "Lublin Swidnik", "ul. Jedyna w miescie 1, Swidnik, Lublin", lublin, new Location(-350,0));
	}

	@Bean
	public Airport lublin2(City lublin) {
		return new Airport(5, "Lublin Radawczyk", "ul. Starodupna 1, Radawczyk, Lublin", lublin, null);
	}

}
