
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActAccommodationReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActAccommodationReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ACCREQNA"/>
 *     &lt;enumeration value="FLRCNV"/>
 *     &lt;enumeration value="MEDNEC"/>
 *     &lt;enumeration value="PAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActAccommodationReason")
@XmlEnum
public enum ActAccommodationReason {

    ACCREQNA,
    FLRCNV,
    MEDNEC,
    PAT;

    public String value() {
        return name();
    }

    public static ActAccommodationReason fromValue(String v) {
        return valueOf(v);
    }

}
