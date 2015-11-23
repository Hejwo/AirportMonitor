package org.hejwo.airportMonitor.web.dao.mockImpl;

import org.hejwo.airportMonitor.web.dao.AirportDAO;
import org.hejwo.airportMonitor.commons.entities.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@Repository
public class AirportDAOMockImpl implements AirportDAO {

	@Autowired
	private List<Airport> airports;

	@Override
	public List<Airport> getAll() {
		return airports;
	}
}
