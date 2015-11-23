package org.hejwo.airportMonitor.web.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : hejwowskip
 * @since : 2015-11-12
 */
@Configuration
@ComponentScan({"org.hejwo.airportMonitor.commons", "org.hejwo.airportMonitor.airTrafficBroadcaster"})
public class BasicConfig {
}
