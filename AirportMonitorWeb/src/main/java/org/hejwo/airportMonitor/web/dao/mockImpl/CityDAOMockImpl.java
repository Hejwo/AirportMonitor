package org.hejwo.airportMonitor.web.dao.mockImpl;

import org.hejwo.airportMonitor.web.dao.CityDAO;
import org.hejwo.airportMonitor.commons.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@Repository
public class CityDAOMockImpl implements CityDAO {

	@Autowired
	private List<City> cities;

	@Override
	public List<City> getAll() {
		return cities;
	}

}
