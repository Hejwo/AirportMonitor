package org.hejwo.airportMonitor.commons.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Airport {

	private Integer id;
	private String name;
	private String address;
	private City city;
	private Location location;

}
