
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkPlaceAddressUse.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkPlaceAddressUse">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="WP"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="PUB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkPlaceAddressUse")
@XmlEnum
public enum WorkPlaceAddressUse {

    WP,
    DIR,
    PUB;

    public String value() {
        return name();
    }

    public static WorkPlaceAddressUse fromValue(String v) {
        return valueOf(v);
    }

}
