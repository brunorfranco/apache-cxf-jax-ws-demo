
package com.pluralsight.schema.flight;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pluralsight.schema.flight package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FlightCheck_QNAME = new QName("http://www.pluralsight.com/schema/Flight", "flightCheck");
    private final static QName _FlightCheckResponse_QNAME = new QName("http://www.pluralsight.com/schema/Flight", "flightCheckResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pluralsight.schema.flight
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightCheckType }
     * 
     */
    public FlightCheckType createFlightCheckType() {
        return new FlightCheckType();
    }

    /**
     * Create an instance of {@link FlightCheckResponseType }
     * 
     */
    public FlightCheckResponseType createFlightCheckResponseType() {
        return new FlightCheckResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCheckType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluralsight.com/schema/Flight", name = "flightCheck")
    public JAXBElement<FlightCheckType> createFlightCheck(FlightCheckType value) {
        return new JAXBElement<FlightCheckType>(_FlightCheck_QNAME, FlightCheckType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCheckResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluralsight.com/schema/Flight", name = "flightCheckResponse")
    public JAXBElement<FlightCheckResponseType> createFlightCheckResponse(FlightCheckResponseType value) {
        return new JAXBElement<FlightCheckResponseType>(_FlightCheckResponse_QNAME, FlightCheckResponseType.class, null, value);
    }

}
