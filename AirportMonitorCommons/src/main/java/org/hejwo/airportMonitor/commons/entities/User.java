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
public class User {

	private Integer id;
	private String name;
	private String password;

	private String uprawnienie; // TODO

}
