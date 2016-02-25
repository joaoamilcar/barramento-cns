
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActRelationshipObjective.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipObjective">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="OBJC"/>
 *     &lt;enumeration value="OBJF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipObjective")
@XmlEnum
public enum ActRelationshipObjective {

    OBJC,
    OBJF;

    public String value() {
        return name();
    }

    public static ActRelationshipObjective fromValue(String v) {
        return valueOf(v);
    }

}
