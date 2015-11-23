package org.hejwo.airportMonitor.commons.mocks;

import org.hejwo.airportMonitor.commons.entities.City;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@Configuration
public class CitiesMock {

	@Bean
	public static City lublin() {
		return new City(1, "Lublin", null);
	}

	@Bean
	public static City wroclaw() {
		return new City(2, "Wroclaw", null);
	}

	@Bean
	public static City warszawa() {
		return new City(3, "Warszawa", null);
	}

	@Bean
	public static City barcelona() {
		return new City(4, "Barcelona", null);
	}

	@Bean
	public static City madryt() {
		return new City(5, "Madryt", null);
	}

	@Bean
	public static City paryz() {
		return new City(6, "Paryz", null);
	}

	@Bean
	public static City oslo() {
		return new City(7, "Oslo", null);
	}

	@Bean
	public static City londyn() {
		return new City(8, "Londyn", null);
	}

	@Bean
	public static City moskwa() {
		return new City(9, "Moskwa", null);
	}

	@Bean
	public static City lwow() {
		return new City(10, "Lwow", null);
	}

	@Bean
	public static City berlin() {
		return new City(11, "Berlin", null);
	}

	@Bean
	public static City praga() {
		return new City(12, "Praga", null);
	}

}
