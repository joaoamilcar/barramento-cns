
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActClassObservationSeries.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassObservationSeries">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="OBSSER"/>
 *     &lt;enumeration value="OBSCOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassObservationSeries")
@XmlEnum
public enum ActClassObservationSeries {

    OBSSER,
    OBSCOR;

    public String value() {
        return name();
    }

    public static ActClassObservationSeries fromValue(String v) {
        return valueOf(v);
    }

}
