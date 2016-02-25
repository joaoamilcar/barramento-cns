
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoleClassLicensedEntity.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassLicensedEntity">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LIC"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="NOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassLicensedEntity")
@XmlEnum
public enum RoleClassLicensedEntity {

    LIC,
    PROV,
    NOT;

    public String value() {
        return name();
    }

    public static RoleClassLicensedEntity fromValue(String v) {
        return valueOf(v);
    }

}
