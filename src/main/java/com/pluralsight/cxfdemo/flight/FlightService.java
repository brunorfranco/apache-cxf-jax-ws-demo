package com.pluralsight.cxfdemo.flight;

import com.pluralsight.schema.flight.FlightCheckResponseType;

public interface FlightService {
	
	public FlightCheckResponseType checkFlight(int uniqueFlightId);
}
