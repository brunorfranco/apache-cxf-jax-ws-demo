package com.pluralsight.cxfdemo.flight;

import org.springframework.stereotype.Service;

import com.pluralsight.schema.flight.FlightCheckResponseType;
import com.pluralsight.schema.flight.FlightStatusType;
import com.pluralsight.schema.flight.ObjectFactory;

@Service
public class FlightServiceImpl implements FlightService{

	@Override
	public FlightCheckResponseType checkFlight(int uniqueFlightId) {
		ObjectFactory factory = new ObjectFactory();
		FlightCheckResponseType response = factory.createFlightCheckResponseType();
		if(uniqueFlightId == 123) {
			response.setStatus(FlightStatusType.CONFIRMED);
		} else {
			response.setStatus(FlightStatusType.UNCONFIRMED);
		}
		return response;
	}

}
