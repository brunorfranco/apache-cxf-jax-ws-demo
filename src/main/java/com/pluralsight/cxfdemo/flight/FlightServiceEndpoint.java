package com.pluralsight.cxfdemo.flight;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.schema.flight.FlightCheckResponseType;
import com.pluralsight.schema.flight.FlightCheckType;
import com.pluralsight.service.flights.Flights;

@WebService(portName="FlightsSOAP", serviceName="Flights",
endpointInterface="com.pluralsight.service.flights.Flights",
targetNamespace="http://www.pluralsight.com/service/Flights/")
public class FlightServiceEndpoint implements Flights {
	
	@Autowired
	private FlightService service;

	@Override
	public FlightCheckResponseType processFlightsCheck(
			FlightCheckType flightCheck) {
		FlightCheckResponseType response = service.checkFlight(flightCheck.getUniqueFlightId());
		return response;
	}

}
