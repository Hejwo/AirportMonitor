package org.hejwo.airportMonitor.airTrafficBroadcaster;

import org.hejwo.airportMonitor.commons.entities.Plane;

/**
 * Hello world!
 *
 */
public class AirTrafficBroadcasterApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public void start() {
        // All Quartz shit.

        // Start plane 1

        // Start plane 2
    }

    public void registerPlaneWatch(Plane plane) {
        // Start to send data to Web. Use Observer pattern.
    }

    public void unregisterPlaneWatch(Plane plane) {
        // www
    }
}
