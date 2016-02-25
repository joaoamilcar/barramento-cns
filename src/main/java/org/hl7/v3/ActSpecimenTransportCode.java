
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActSpecimenTransportCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecimenTransportCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SSTOR"/>
 *     &lt;enumeration value="STRAN"/>
 *     &lt;enumeration value="SREC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSpecimenTransportCode")
@XmlEnum
public enum ActSpecimenTransportCode {

    SSTOR,
    STRAN,
    SREC;

    public String value() {
        return name();
    }

    public static ActSpecimenTransportCode fromValue(String v) {
        return valueOf(v);
    }

}
