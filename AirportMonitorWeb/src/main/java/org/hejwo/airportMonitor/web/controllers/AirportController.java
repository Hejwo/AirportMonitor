package org.hejwo.airportMonitor.web.controllers;

import org.hejwo.airportMonitor.commons.entities.Airport;
import org.hejwo.airportMonitor.web.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@RestController
@RequestMapping("/airport")
public class AirportController {

	private final AirportService airportService;

	@Autowired
	public AirportController(AirportService airportService) {
		this.airportService = airportService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Airport> getAll() {
		return airportService.getAll();
	}

}
