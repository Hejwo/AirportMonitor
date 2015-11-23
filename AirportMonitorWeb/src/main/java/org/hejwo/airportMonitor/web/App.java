package org.hejwo.airportMonitor.web;

import lombok.extern.slf4j.Slf4j;
import org.hejwo.airportMonitor.airTrafficBroadcaster.AirTrafficBroadcasterApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		AirTrafficBroadcasterApp broadcasterApp = new AirTrafficBroadcasterApp();
		broadcasterApp.start();

		registerPlanes(broadcasterApp);

		SpringApplication.run(App.class, args);
	}

	private static void registerPlanes(AirTrafficBroadcasterApp broadcasterApp) {
//		Plane plane1 = (Plane)applicationContext.getBean("plane1");
//		Plane plane2 = (Plane)applicationContext.getBean("plane2");
//
//		broadcasterApp.registerPlaneWatch(plane1);
//		broadcasterApp.registerPlaneWatch(plane2);
	}
}
