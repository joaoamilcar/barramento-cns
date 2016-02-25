
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActConsentInformationAccessOverrideReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActConsentInformationAccessOverrideReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="OVRER"/>
 *     &lt;enumeration value="OVRPJ"/>
 *     &lt;enumeration value="OVRPS"/>
 *     &lt;enumeration value="OVRTPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActConsentInformationAccessOverrideReason")
@XmlEnum
public enum ActConsentInformationAccessOverrideReason {

    OVRER,
    OVRPJ,
    OVRPS,
    OVRTPS;

    public String value() {
        return name();
    }

    public static ActConsentInformationAccessOverrideReason fromValue(String v) {
        return valueOf(v);
    }

}
