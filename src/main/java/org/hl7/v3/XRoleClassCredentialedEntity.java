
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_RoleClassCredentialedEntity.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCredentialedEntity">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="QUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassCredentialedEntity")
@XmlEnum
public enum XRoleClassCredentialedEntity {

    ASSIGNED,
    QUAL;

    public String value() {
        return name();
    }

    public static XRoleClassCredentialedEntity fromValue(String v) {
        return valueOf(v);
    }

}
