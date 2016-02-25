
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SubstanceAdminGenericSubstitution.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstanceAdminGenericSubstitution">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="TE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubstanceAdminGenericSubstitution")
@XmlEnum
public enum SubstanceAdminGenericSubstitution {

    G,
    TE;

    public String value() {
        return name();
    }

    public static SubstanceAdminGenericSubstitution fromValue(String v) {
        return valueOf(v);
    }

}
