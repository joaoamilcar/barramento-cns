
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActMoodProposal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodProposal">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RMD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActMoodProposal")
@XmlEnum
public enum ActMoodProposal {

    PRP,
    RMD;

    public String value() {
        return name();
    }

    public static ActMoodProposal fromValue(String v) {
        return valueOf(v);
    }

}
