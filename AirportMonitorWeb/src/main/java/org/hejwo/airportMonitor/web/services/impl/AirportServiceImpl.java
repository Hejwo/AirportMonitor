package org.hejwo.airportMonitor.web.services.impl;

import org.hejwo.airportMonitor.web.dao.AirportDAO;
import org.hejwo.airportMonitor.commons.entities.Airport;
import org.hejwo.airportMonitor.web.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@Service
public class AirportServiceImpl implements AirportService {

	private final AirportDAO airportDAO;

	@Autowired
	public AirportServiceImpl(AirportDAO airportDAO) {
		this.airportDAO = airportDAO;
	}

	@Override
	public List<Airport> getAll() {
		return airportDAO.getAll();
	}
}
