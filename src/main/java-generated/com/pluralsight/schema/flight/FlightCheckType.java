
package com.pluralsight.schema.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightCheckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCheckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uniqueFlightId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flightTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberOfSits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCheckType", propOrder = {
    "uniqueFlightId"
})
public class FlightCheckType {

    protected int uniqueFlightId;

    /**
     * Gets the value of the uniqueFlightId property.
     * 
     */
    public int getUniqueFlightId() {
        return uniqueFlightId;
    }

    /**
     * Sets the value of the uniqueFlightId property.
     * 
     */
    public void setUniqueFlightId(int value) {
        this.uniqueFlightId = value;
    }

}
