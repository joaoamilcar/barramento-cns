
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActIneligibilityReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActIneligibilityReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COVSUS"/>
 *     &lt;enumeration value="DECSD"/>
 *     &lt;enumeration value="REGERR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActIneligibilityReason")
@XmlEnum
public enum ActIneligibilityReason {

    COVSUS,
    DECSD,
    REGERR;

    public String value() {
        return name();
    }

    public static ActIneligibilityReason fromValue(String v) {
        return valueOf(v);
    }

}
