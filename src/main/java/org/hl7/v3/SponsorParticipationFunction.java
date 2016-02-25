
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SponsorParticipationFunction.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SponsorParticipationFunction">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FULINRD"/>
 *     &lt;enumeration value="SELFINRD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SponsorParticipationFunction")
@XmlEnum
public enum SponsorParticipationFunction {

    FULINRD,
    SELFINRD;

    public String value() {
        return name();
    }

    public static SponsorParticipationFunction fromValue(String v) {
        return valueOf(v);
    }

}
