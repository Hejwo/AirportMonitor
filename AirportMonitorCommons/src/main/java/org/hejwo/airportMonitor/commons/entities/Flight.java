package org.hejwo.airportMonitor.commons.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Flight {

	private Integer id;
	private String flightId;
	private Plane plane;

	private Airport startAirport;
	private Airport endAirport;

	private LocalTime startTime;
	private LocalTime endTime;
}
