package com.pluralsight.service.flights;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2016-06-26T19:11:22.113+01:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "Flights", 
                  wsdlLocation = "file:/C:/Users/Bruno/Documents/GitHub/apache-cxf-jax-ws-demo/src/main/resources/wsdl/Flights.wsdl",
                  targetNamespace = "http://www.pluralsight.com/service/Flights/") 
public class Flights_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.pluralsight.com/service/Flights/", "Flights");
    public final static QName FlightsSOAP = new QName("http://www.pluralsight.com/service/Flights/", "FlightsSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Bruno/Documents/GitHub/apache-cxf-jax-ws-demo/src/main/resources/wsdl/Flights.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Flights_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Bruno/Documents/GitHub/apache-cxf-jax-ws-demo/src/main/resources/wsdl/Flights.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Flights_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Flights_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Flights_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Flights_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Flights_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Flights_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Flights
     */
    @WebEndpoint(name = "FlightsSOAP")
    public Flights getFlightsSOAP() {
        return super.getPort(FlightsSOAP, Flights.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Flights
     */
    @WebEndpoint(name = "FlightsSOAP")
    public Flights getFlightsSOAP(WebServiceFeature... features) {
        return super.getPort(FlightsSOAP, Flights.class, features);
    }

}
