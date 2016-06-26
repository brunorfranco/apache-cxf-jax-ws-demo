
package com.pluralsight.schema.flight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNCONFIRMED"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightStatusType")
@XmlEnum
public enum FlightStatusType {

	UNCONFIRMED,
	CONFIRMED;

    public String value() {
        return name();
    }

    public static FlightStatusType fromValue(String v) {
        return valueOf(v);
    }

}
