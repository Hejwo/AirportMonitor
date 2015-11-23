package org.hejwo.airportMonitor.web.services.impl;

import org.hejwo.airportMonitor.web.dao.CityDAO;
import org.hejwo.airportMonitor.commons.entities.City;
import org.hejwo.airportMonitor.web.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@Service
public class CityServiceImpl implements CityService {

	private final CityDAO cityDAO;

	@Autowired
	public CityServiceImpl(CityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}

	@Override
	public List<City> getAll() {
		return cityDAO.getAll();
	}
}
