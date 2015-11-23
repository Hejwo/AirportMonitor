package org.hejwo.airportMonitor.web.services;

import org.hejwo.airportMonitor.commons.entities.Airport;

import java.util.List;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
public interface AirportService {

	List<Airport> getAll();

}
