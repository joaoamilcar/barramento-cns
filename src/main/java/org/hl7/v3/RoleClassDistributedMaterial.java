
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoleClassDistributedMaterial.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassDistributedMaterial">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DST"/>
 *     &lt;enumeration value="RET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassDistributedMaterial")
@XmlEnum
public enum RoleClassDistributedMaterial {

    DST,
    RET;

    public String value() {
        return name();
    }

    public static RoleClassDistributedMaterial fromValue(String v) {
        return valueOf(v);
    }

}
