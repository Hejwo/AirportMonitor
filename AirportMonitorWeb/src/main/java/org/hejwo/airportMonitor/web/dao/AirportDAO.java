package org.hejwo.airportMonitor.web.dao;

import org.hejwo.airportMonitor.commons.entities.Airport;

import java.util.List;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
public interface AirportDAO {

	List<Airport> getAll();

}
