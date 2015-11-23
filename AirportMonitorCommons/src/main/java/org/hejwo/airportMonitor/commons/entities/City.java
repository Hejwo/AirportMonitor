package org.hejwo.airportMonitor.commons.entities;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class City {

	private Integer id;
	private String name;
	private Location location;

}
