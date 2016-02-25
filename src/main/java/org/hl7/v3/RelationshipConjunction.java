
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RelationshipConjunction.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipConjunction">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="XOR"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationshipConjunction")
@XmlEnum
public enum RelationshipConjunction {

    AND,
    XOR,
    OR;

    public String value() {
        return name();
    }

    public static RelationshipConjunction fromValue(String v) {
        return valueOf(v);
    }

}
