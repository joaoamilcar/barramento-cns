
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoleClassOntologicalEquivalentEntityByBOT.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassOntologicalEquivalentEntityByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EQUIV"/>
 *     &lt;enumeration value="SAME"/>
 *     &lt;enumeration value="SUBY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassOntologicalEquivalentEntityByBOT")
@XmlEnum
public enum RoleClassOntologicalEquivalentEntityByBOT {

    EQUIV,
    SAME,
    SUBY;

    public String value() {
        return name();
    }

    public static RoleClassOntologicalEquivalentEntityByBOT fromValue(String v) {
        return valueOf(v);
    }

}
