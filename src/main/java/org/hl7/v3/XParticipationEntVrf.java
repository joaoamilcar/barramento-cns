
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_ParticipationEntVrf.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationEntVrf">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENT"/>
 *     &lt;enumeration value="VRF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationEntVrf")
@XmlEnum
public enum XParticipationEntVrf {

    ENT,
    VRF;

    public String value() {
        return name();
    }

    public static XParticipationEntVrf fromValue(String v) {
        return valueOf(v);
    }

}
