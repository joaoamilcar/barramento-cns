
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActRelationshipExcerpt.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipExcerpt">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="XCRPT"/>
 *     &lt;enumeration value="VRXCRPT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipExcerpt")
@XmlEnum
public enum ActRelationshipExcerpt {

    XCRPT,
    VRXCRPT;

    public String value() {
        return name();
    }

    public static ActRelationshipExcerpt fromValue(String v) {
        return valueOf(v);
    }

}
