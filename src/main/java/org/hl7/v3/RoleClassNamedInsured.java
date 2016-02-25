
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoleClassNamedInsured.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassNamedInsured">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NAMED"/>
 *     &lt;enumeration value="DEPEN"/>
 *     &lt;enumeration value="INDIV"/>
 *     &lt;enumeration value="SUBSCR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassNamedInsured")
@XmlEnum
public enum RoleClassNamedInsured {

    NAMED,
    DEPEN,
    INDIV,
    SUBSCR;

    public String value() {
        return name();
    }

    public static RoleClassNamedInsured fromValue(String v) {
        return valueOf(v);
    }

}
