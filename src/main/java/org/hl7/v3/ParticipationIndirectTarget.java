
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ParticipationIndirectTarget.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationIndirectTarget">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="BEN"/>
 *     &lt;enumeration value="CAGNT"/>
 *     &lt;enumeration value="COV"/>
 *     &lt;enumeration value="GUAR"/>
 *     &lt;enumeration value="HLD"/>
 *     &lt;enumeration value="RCV"/>
 *     &lt;enumeration value="RCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationIndirectTarget")
@XmlEnum
public enum ParticipationIndirectTarget {

    IND,
    BEN,
    CAGNT,
    COV,
    GUAR,
    HLD,
    RCV,
    RCT;

    public String value() {
        return name();
    }

    public static ParticipationIndirectTarget fromValue(String v) {
        return valueOf(v);
    }

}
