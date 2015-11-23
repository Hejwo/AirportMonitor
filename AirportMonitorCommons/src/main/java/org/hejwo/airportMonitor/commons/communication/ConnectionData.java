package org.hejwo.airportMonitor.commons.communication;

import lombok.Data;

import javax.validation.constraints.NotNull;

import static java.util.Objects.*;

/**
 * @author : Hejwo
 * @since : 2015-11-15.
 */
@Data
public class ConnectionData {

    private final String host;
    private final Integer port;
    private final String address;
    private final CommunicationMethod communicationMethod;

    public ConnectionData(@NotNull String host, @NotNull Integer port, @NotNull String address,
                          @NotNull CommunicationMethod communicationMethod) {
        this.host = checkNotNull(host, "host");
        this.port = checkNotNull(port, "port");
        this.address = checkNotNull(address, "address");
        this.communicationMethod = checkNotNull(communicationMethod, "communicationMethod");
    }

    public <T> T checkNotNull(T t, String paramName) {
        String nullMessage = "Parameter '%s' cannot be null !";
        return requireNonNull(t, String.format(nullMessage, paramName));
    }
}
