package org.hejwo.airportMonitor.web.controllers;

import org.hejwo.airportMonitor.commons.entities.City;
import org.hejwo.airportMonitor.web.services.CityService;
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
@RequestMapping("/city")
public class CityController {

	private final CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		this.cityService = cityService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<City> getAll() {
		return cityService.getAll();
	}

}
