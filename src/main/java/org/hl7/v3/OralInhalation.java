
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OralInhalation.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OralInhalation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ORINHL"/>
 *     &lt;enumeration value="ORIFINHL"/>
 *     &lt;enumeration value="REBREATH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OralInhalation")
@XmlEnum
public enum OralInhalation {

    ORINHL,
    ORIFINHL,
    REBREATH;

    public String value() {
        return name();
    }

    public static OralInhalation fromValue(String v) {
        return valueOf(v);
    }

}
