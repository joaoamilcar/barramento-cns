
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoleClassManufacturedProduct.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassManufacturedProduct">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MANU"/>
 *     &lt;enumeration value="THER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassManufacturedProduct")
@XmlEnum
public enum RoleClassManufacturedProduct {

    MANU,
    THER;

    public String value() {
        return name();
    }

    public static RoleClassManufacturedProduct fromValue(String v) {
        return valueOf(v);
    }

}
