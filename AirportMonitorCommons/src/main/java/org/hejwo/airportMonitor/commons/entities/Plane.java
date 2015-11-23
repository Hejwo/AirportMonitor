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
public class Plane {

	private Integer id;
	private String planeId;
	private PlaneType planeType;
	private Airline airline;
	private Integer capacity;
	private Location location;

}
