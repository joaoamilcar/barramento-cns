
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_AccommodationRequestorRole.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_AccommodationRequestorRole">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="PRS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_AccommodationRequestorRole")
@XmlEnum
public enum XAccommodationRequestorRole {

    AGNT,
    PROV,
    PAT,
    PRS;

    public String value() {
        return name();
    }

    public static XAccommodationRequestorRole fromValue(String v) {
        return valueOf(v);
    }

}
