package com.pluralsight.service.flights;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2016-06-26T19:11:22.103+01:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://www.pluralsight.com/service/Flights/", name = "Flights")
@XmlSeeAlso({com.pluralsight.schema.flight.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Flights {

    @WebMethod(operationName = "ProcessFlightsCheck", action = "http://www.pluralsight.com/service/Flights/ProcessFlightsCheck")
    @WebResult(name = "flightCheckResponse", targetNamespace = "http://www.pluralsight.com/schema/Flight", partName = "flightCheckResponse")
    public com.pluralsight.schema.flight.FlightCheckResponseType processFlightsCheck(
        @WebParam(partName = "flightCheck", name = "flightCheck", targetNamespace = "http://www.pluralsight.com/schema/Flight")
        com.pluralsight.schema.flight.FlightCheckType flightCheck
    );
}
